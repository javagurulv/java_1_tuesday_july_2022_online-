package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDiagonalDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        int[][] playerOneWinningGame1 = {   {0,  -1, -1},
                                            {-1,  0, -1},
                                            {-1, -1,  0}};

        int[][] playerOneWinningGame2 = {   {-1, -1,  0},
                                            {-1,  0, -1},
                                            {0,  -1, -1}};

        int[][] playerTwoWinningGame3 = {   { 1,  1,  1},
                                            {-1,  1, -1},
                                            {-1, -1,  1}};

        int[][] playerTwoWinningGame4 = {   {-1, -1,  1},
                                            {-1,  1, -1},
                                            { 1, -1, -1}};

        int playerOne = 0;
        boolean isGame1Player1Win = game.isWinPositionForDiagonals(playerOneWinningGame1, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame1Player1Win);

        boolean isGame2Player1Win = game.isWinPositionForDiagonals(playerOneWinningGame2, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame2Player1Win);

        int playerTwo = 1;
        boolean isGame4Player2Win = game.isWinPositionForDiagonals(playerTwoWinningGame3, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2Win);

        boolean isGame5Player2Win = game.isWinPositionForDiagonals(playerTwoWinningGame4, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2Win);

    }
}
