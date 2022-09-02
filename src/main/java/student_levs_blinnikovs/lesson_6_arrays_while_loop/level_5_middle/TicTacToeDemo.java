package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        int playerOne = 0;
        int playerTwo = 1;
        int emptyField = -1;

        int[][] emptyExistsPosition = {              {-1, 0, -1},
                                                    {-1, -1, -1},
                                                    {-1, -1, -1}
        };

        // hasEmptyField

        System.out.println("Empty fields exist test: ");
        boolean isEmptyFieldPosition = game.isWinPosition(emptyExistsPosition, playerOne); // TODO gives false positive results
        System.out.println("Empty fields exist: " + isEmptyFieldPosition);

        int[][] noOneWinningGame = {        {-1, -1, -1},
                                            {-1, -1, -1},
                                            {-1, -1, -1}};

        int[][] playerOneWinningGame1Diagonally1 = {    {0,  -1, -1},
                                                        {-1,  0, -1},
                                                        {-1, -1,  0}};

        int[][] playerOneWinningGame2Diagonally2 = {    {-1, -1,  0},
                                                        {-1,  0, -1},
                                                        {0,  -1, -1}};

        int[][] playerTwoWinningGame3Diagonally1 = {    { 1,  1,  1},
                                                        {-1,  1, -1},
                                                        {-1, -1,  1}};

        int[][] playerTwoWinningGame4Diagonally2 = {    {-1, -1,  1},
                                                        {-1,  1, -1},
                                                        { 1, -1, -1}};

        System.out.println("No one tests: ");
        boolean noOneWins = game.isWinPosition(noOneWinningGame, emptyField);
        System.out.println("No one wins as field is empty (-1): " + noOneWins);

        System.out.println("Diagonal tests: ");
        boolean isGame1Player1WinDiag = game.isWinPositionForDiagonals(playerOneWinningGame1Diagonally1, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame1Player1WinDiag);

        boolean isGame2Player1WinDiag = game.isWinPositionForDiagonals(playerOneWinningGame2Diagonally2, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame2Player1WinDiag);

        boolean isGame4Player2WinDiag = game.isWinPositionForDiagonals(playerTwoWinningGame3Diagonally1, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2WinDiag);

        boolean isGame5Player2WinDiag = game.isWinPositionForDiagonals(playerTwoWinningGame4Diagonally2, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2WinDiag);


        // horizontal tests
        int[][] playerOneWinningGame1Horizontal1 = {    {0,   0,  0},
                                                        {-1, -1, -1},
                                                        {-1, -1, -1}};

        int[][] playerOneWinningGame2Horizontal2 = {    {-1, -1, -1},
                                                        { 0,  0,  0},
                                                        {-1, -1, -1}};

        int[][] playerOneWinningGame3Horizontal3 = {    {-1, -1, -1},
                                                        {-1, -1, -1},
                                                        { 0,  0,  0}};

        int[][] playerTwoWinningGame4Horizontal1 = {    { 1,  1,  1},
                                                        {-1, -1, -1},
                                                        {-1, -1, -1}};

        int[][] playerTwoWinningGame5Horizontal2 = {    {-1, -1, -1},
                                                        { 1,  1,  1},
                                                        {-1, -1, -1}};

        int[][] playerTwoWinningGame4Horizontal3 = {    {-1, -1, -1},
                                                        {-1, -1, -1},
                                                        { 1,  1,  1}};

        // vertical tests

        int[][] playerOneWinningGame1Vertical1 = {      {0, -1, -1},
                                                        {0, -1, -1},
                                                        {0, -1, -1}};

        int[][] playerOneWinningGame2Vertical2 = {      {-1, 0, -1},
                                                        {-1, 0, -1},
                                                        {-1, 0, -1}};

        int[][] playerOneWinningGame3Vertical3 = {      {-1, -1, 0},
                                                        {-1, -1, 0},
                                                        {-1, -1, 0}};

        int[][] playerTwoWinningGame4Vertical1 = {      {1, -1, -1},
                                                        {1, -1, -1},
                                                        {1, -1, -1}};

        int[][] playerTwoWinningGame5Vertical2 = {      {-1, 1, -1},
                                                        {-1, 1, -1},
                                                        {-1, 1, -1}};

        int[][] playerTwoWinningGame6Vertical3 = {      {-1, -1, 1},
                                                        {-1, -1, 1},
                                                        {-1, -1, 1}};

        System.out.println("Horizontal tests: ");

        boolean isGame1Player1WinByHorizontal1 = game.isWinPositionForHorizontals(playerOneWinningGame1Horizontal1, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame1Player1WinByHorizontal1);

        boolean isGame2Player1WinByHorizontal2 = game.isWinPositionForHorizontals(playerOneWinningGame2Horizontal2, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame2Player1WinByHorizontal2);

        boolean isGame3Player1WinByHorizontal3 = game.isWinPositionForHorizontals(playerOneWinningGame3Horizontal3, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame3Player1WinByHorizontal3);

        boolean isGame4Player1WinByHorizontal1 = game.isWinPositionForHorizontals(playerTwoWinningGame4Horizontal1, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame4Player1WinByHorizontal1);

        boolean isGame5Player2WinByHorizontal2 = game.isWinPositionForHorizontals(playerTwoWinningGame5Horizontal2, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2WinByHorizontal2);

        boolean isGame6Player2WinByHorizontal3 = game.isWinPositionForHorizontals(playerTwoWinningGame4Horizontal3, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame6Player2WinByHorizontal3);


        System.out.println("Vertical tests: ");

        boolean isGame1Player1Win = game.isWinPositionForVerticals(playerOneWinningGame1Vertical1, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame1Player1Win);

        boolean isGame2Player1Win = game.isWinPositionForVerticals(playerOneWinningGame2Vertical2, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame2Player1Win);

        boolean isGame3PlayerGame1Win = game.isWinPositionForVerticals(playerOneWinningGame3Vertical3, playerOne);
        System.out.println("Expected win: Player One (0): " + isGame3PlayerGame1Win);

        boolean isGame4Player2Win = game.isWinPositionForVerticals(playerTwoWinningGame4Vertical1, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2Win);

        boolean isGame5Player2Win = game.isWinPositionForVerticals(playerTwoWinningGame5Vertical2, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2Win);

        boolean isGame6Player2Win = game.isWinPositionForVerticals(playerTwoWinningGame6Vertical3, playerTwo);
        System.out.println("Expected win: Player Two (1): " + isGame6Player2Win);

    }
}
