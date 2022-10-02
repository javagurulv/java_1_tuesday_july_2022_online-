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
    }
}