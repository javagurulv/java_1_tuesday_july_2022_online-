package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        int[][] noOneWinningGame = {{-1, -1, -1},
                                    {-1, -1, -1},
                                    {-1, -1, -1}};

        int[][] playerOneWinningGame = {    { 0, -1, -1},
                                            {-1,  0, -1},
                                            {-1, -1,  0}};

        int[][] playerTwoWinningGame = {    {-1, -1, -1},
                                            { 1,  1,  1},
                                            {-1, -1, -1}};

        int playerOne = 0;
        int playerTwo = 1;
        int emptyField = -1;

        boolean playerOneWins = game.isWinPosition(playerOneWinningGame, playerOne);
        System.out.println("Player One (0) wins: " + playerOneWins);

        boolean playerTwoWins = game.isWinPosition(playerTwoWinningGame, playerTwo);
        System.out.println("Player Two (1) wins: " + playerTwoWins);

        boolean noOneWins = game.isWinPosition(noOneWinningGame, emptyField);
        System.out.println("No one wins as field is empty (-1): " + noOneWins);

    }
}
