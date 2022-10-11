package student_yurii_panasiuk.lesson_10.level_7;

class Playground {

    Figures [] [] board = {
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY},
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY},
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY},
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY},
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY},
            {Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY,Figures.EMPTY}    };

    void boardOutput (){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

     Figures[][] getBoard() {
        return board;
    }

    void setBoard(int[] board, Figures color) {
        this.board [board[0]] [board[1]] = color;
    }

    void lowerTheChip (Figures color) {
        for (int i = 0; i < (board.length-1); i++) {
             for (int j = 0; j < board[i].length; j++) {
               if (board[i][j] == color && board[i+1][j] == Figures.EMPTY){
                   board[i][j] = Figures.EMPTY;
                   board[i+1][j] = color;
               }
            }
            }
    }

    void checkResult (Figures color) {
        int i;
        int j;
        for ( i = 0; i < (board.length); i++) {
            for ( j = 0; j < board[i].length; j++) {
                if (board[i][j] == color){

                    int up;
                    int right;
                    int rightUp;
                    int rightUpJ;
                    int upCounter = 0;
                    int downCounter = 0;
                    int rightCounter = 0;
                    int leftCounter = 0;
                    int rightUpCounter = 0;
                    int rightDownCounter = 0;

                    // организуем проверку по вертикали
                    for (up = i; up < (board.length); up++) {
                          if (board[up][j] == color) {
                            downCounter++;
                                if (downCounter == 4) {
                                    System.out.println( color + "player WIN's");
                                    return;}
                          }
                    }
                    // организуем проверку по горизонтали
                    for (right = j; right < (board[i].length); right++) {
                        if (board[i][right] == color) {
                            rightCounter++;
                            if (rightCounter == 4) {
                                System.out.println( color + "player WIN's");
                                return;
                            }
                        }
                    }


                    // организуем проверку по диагонали1
                    for (up = i; up < (board.length); up++) {
                        if (board[up][j+1] == color) {
                            rightDownCounter++;
                            if (rightDownCounter == 4) {
                                System.out.println( color + "player WIN's");
                                return;}
                        }
                    }
                    // организуем проверку вниз/вправо
                    for (rightUp = i; rightUp < (board.length); rightUp++) {
                        for (rightUpJ = j; rightUpJ < board[i].length; rightUpJ++) {
                            if (board[rightUp][rightUpJ] == color) {rightDownCounter++;}
                        }
                    }


                    if (upCounter>3 || rightCounter>3 || rightUpCounter>3 ) {
                        System.out.println( color + "player WIN's");
                    }
                }
            }
        }
    }


}