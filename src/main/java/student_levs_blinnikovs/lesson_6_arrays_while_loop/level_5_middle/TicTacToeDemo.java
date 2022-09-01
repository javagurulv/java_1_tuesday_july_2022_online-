package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        int[][] noOneWinningGame = {{-1, -1, -1},
                                    {-1, -1, -1},
                                    {-1, -1, -1}};

        int[][] playerOneWinningGame1 = {   {0,  0,  0},
                                            {0, -1, -1},
                                            {0, -1, -1}};

        int[][] playerOneWinningGame2 = {   {-1, -1, -1},
                                            { 0,  0,  0},
                                            {-1, -1, -1}};

        int[][] playerOneWinningGame3 = {   {-1, -1, -1},
                                            {-1, -1, -1},
                                            { 0,  0,  0}};

        int[][] playerTwoWinningGame4 = {   { 1,  1,  1},
                                            {-1, -1, -1},
                                            {-1, -1, -1}};

        int[][] playerTwoWinningGame5 = {   {-1, -1, -1},
                                            { 1,  1,  1},
                                            {-1, -1, -1}};

        int[][] playerTwoWinningGame6 = {   {-1, -1, -1},
                                            {-1, -1, -1},
                                            {1,   1,  1}};

        int playerOne = 0;
        boolean isGame1Player1Win = game.isWinPositionForHorizontals(playerOneWinningGame1, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame1Player1Win);

        boolean isGame2Player1Win = game.isWinPositionForHorizontals(playerOneWinningGame2, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame2Player1Win);

        boolean isGame3PlayerGame1Win = game.isWinPositionForHorizontals(playerOneWinningGame3, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame3PlayerGame1Win);

        int playerTwo = 1;
        boolean isGame4Player2Win = game.isWinPositionForHorizontals(playerTwoWinningGame4, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2Win);

        boolean isGame5Player2Win = game.isWinPositionForHorizontals(playerTwoWinningGame5, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2Win);

        boolean isGame6Player2Win = game.isWinPositionForHorizontals(playerTwoWinningGame6, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame6Player2Win);

        int emptyField = -1;
        boolean noOneWins = game.isWinPositionForHorizontals(noOneWinningGame, emptyField);
        System.out.println("No one wins as field is empty: " + noOneWins);

    }
}
