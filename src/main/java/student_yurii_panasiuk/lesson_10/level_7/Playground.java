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

    void lowerTheChip () {
        for (int i = 0; i < (board.length-1); i++) {
            for (int j = 0; j < board[i].length; j++) {
               if  (board[i][j] !=  Figures.EMPTY && board[i][j] !=  Figures.EMPTY){

               }
            };
            }

    }
}