package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {

    public TicTacToe startGame() {
        return new TicTacToe();
    }

    public void shouldExistEmptyCell() {
        int[][] emptyCellExists = {
                { 0,  0, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        boolean doesEmptyFieldExist = startGame().hasEmptyField(emptyCellExists); // TODO for isWin().. gives false positive results because treats -1 as win. Need to include -1 logic in TicTacToe methods
        System.out.println("Empty field exist: " + doesEmptyFieldExist);
    }

    public void shouldNotExistEmptyCell() {
        int[][] emptyCellDoesNotExist = {
                {0, 0, 0},
                {1, 1, 1},
                {0, 1, 1}};
        boolean doesEmptyFieldDoesNotExist = startGame().hasEmptyField(emptyCellDoesNotExist);
        System.out.println("Empty field DOEST NOT exist: " + doesEmptyFieldDoesNotExist);
    }

    public void shouldNoOneWin() {
        int[][] noOneWinningGame = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        boolean noOneWins = startGame().isWinPosition(noOneWinningGame, -1);
        System.out.println("No one wins as field is empty (-1): " + noOneWins);
    }

    public void shouldPlayer0WinByHorizontal0() {
        int[][] playerOneWinningGame1Horizontal1 = {
                {0,   0,  0},
                {-1, -1, -1},
                {-1, -1, -1}};
        boolean isGame1Player1WinByHorizontal1 = startGame().isWinPositionForHorizontals(playerOneWinningGame1Horizontal1, 0);
        System.out.println("Expected win: Player One (0): " + isGame1Player1WinByHorizontal1);
    }

    public void shouldPlayer0WinByHorizontal1() {
        int[][] playerOneWinningGame2Horizontal2 = {
                {-1, -1, -1},
                { 0,  0,  0},
                {-1, -1, -1}};
        boolean isGame2Player1WinByHorizontal2 = startGame().isWinPositionForHorizontals(playerOneWinningGame2Horizontal2, 0);
        System.out.println("Expected win: Player One (0): " + isGame2Player1WinByHorizontal2);
    }

    public void shouldPlayer0WinByHorizontal2() {
        int[][] playerOneWinningGame3Horizontal3 = {
                {-1, -1, -1},
                {-1, -1, -1},
                { 0,  0,  0}};
        boolean isGame3Player1WinByHorizontal3 = startGame().isWinPositionForHorizontals(playerOneWinningGame3Horizontal3, 0);
        System.out.println("Expected win: Player One (0): " + isGame3Player1WinByHorizontal3);
    }

    public void shouldPlayer1WinByHorizontal0() {
        int[][] playerTwoWinningGame4Horizontal1 = {
                { 1,  1,  1},
                {-1, -1, -1},
                {-1, -1, -1}};
        boolean isGame4Player1WinByHorizontal1 = startGame().isWinPositionForHorizontals(playerTwoWinningGame4Horizontal1, 1);
        System.out.println("Expected win: Player Two (1): " + isGame4Player1WinByHorizontal1);
    }

    public void shouldPlayer1WinByHorizontal1() {
        int[][] playerTwoWinningGame5Horizontal2 = {
                {-1, -1, -1},
                { 1,  1,  1},
                {-1, -1, -1}};
        boolean isGame5Player2WinByHorizontal2 = startGame().isWinPositionForHorizontals(playerTwoWinningGame5Horizontal2, 1);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2WinByHorizontal2);
    }

    public void shouldPlayer1WinByHorizontal2() {
        int[][] playerTwoWinningGame4Horizontal3 = {
                {-1, -1, -1},
                {-1, -1, -1},
                { 1,  1,  1}};
        boolean isGame6Player2WinByHorizontal3 = startGame().isWinPositionForHorizontals(playerTwoWinningGame4Horizontal3, 1);
        System.out.println("Expected win: Player Two (1): " + isGame6Player2WinByHorizontal3);
    }

    public void shouldPlayer0WinByVertical0() {
        int[][] playerOneWinningGame1Vertical1 = {
                {0, -1, -1},
                {0, -1, -1},
                {0, -1, -1}};
        boolean isGame1Player1Win = startGame().isWinPositionForVerticals(playerOneWinningGame1Vertical1, 0);
        System.out.println("Expected win: Player One (0): " + isGame1Player1Win);
    }

    public void shouldPlayer0WinByVertical1() {
        int[][] playerOneWinningGame2Vertical2 = {
                {-1, 0, -1},
                {-1, 0, -1},
                {-1, 0, -1}};
        boolean isGame2Player1Win = startGame().isWinPositionForVerticals(playerOneWinningGame2Vertical2, 0);
        System.out.println("Expected win: Player One (0): " + isGame2Player1Win);
    }

    public void shouldPlayer0WinByVertical2() {
        int[][] playerOneWinningGame3Vertical3 = {
                {-1, -1, 0},
                {-1, -1, 0},
                {-1, -1, 0}};
        boolean isGame3PlayerGame1Win = startGame().isWinPositionForVerticals(playerOneWinningGame3Vertical3, 0);
        System.out.println("Expected win: Player One (0): " + isGame3PlayerGame1Win);
    }

    public void shouldPlayer1WinByVertical0() {
        int[][] playerTwoWinningGame4Vertical1 = {
                {1, -1, -1},
                {1, -1, -1},
                {1, -1, -1}};
        boolean isGame4Player2Win = startGame().isWinPositionForVerticals(playerTwoWinningGame4Vertical1, 1);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2Win);
    }

    public void shouldPlayer1WinByVertical1() {
        int[][] playerTwoWinningGame5Vertical2 = {
                {-1, 1, -1},
                {-1, 1, -1},
                {-1, 1, -1}};
        boolean isGame5Player2Win = startGame().isWinPositionForVerticals(playerTwoWinningGame5Vertical2, 1);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2Win);
    }

    public void shouldPlayer1WinByVertical2() {
        int[][] playerTwoWinningGame6Vertical3 = {
                {-1, -1, 1},
                {-1, -1, 1},
                {-1, -1, 1}};
        boolean isGame6Player2Win = startGame().isWinPositionForVerticals(playerTwoWinningGame6Vertical3, 1);
        System.out.println("Expected win: Player Two (1): " + isGame6Player2Win);
    }

    public void shouldPlayer0WinByTopLeftToBottomRightDiagonal() {
        int[][] playerOneWinningGame1Diagonally1 = {
                {0,  -1, -1},
                {-1,  0, -1},
                {-1, -1,  0}};
        boolean isGame1Player1WinDiag = startGame().isWinPositionForDiagonals(playerOneWinningGame1Diagonally1, 0);
        System.out.println("Expected win: Player One (0): " + isGame1Player1WinDiag);
    }

    public void shouldPlayer0WinByTopRightToBottomLeftDiagonal() {
        int[][] playerOneWinningGame2Diagonally2 = {
                {-1, -1,  0},
                {-1,  0, -1},
                {0,  -1, -1}};
        boolean isGame2Player1WinDiag = startGame().isWinPositionForDiagonals(playerOneWinningGame2Diagonally2, 0);
        System.out.println("Expected win: Player One (0): " + isGame2Player1WinDiag);
    }

    public void shouldPlayer1WinByTopLeftToBottomRightDiagonal() {
        int[][] playerTwoWinningGame3Diagonally1 = {
                { 1,  1,  1},
                {-1,  1, -1},
                {-1, -1,  1}};
        boolean isGame4Player2WinDiag = startGame().isWinPositionForDiagonals(playerTwoWinningGame3Diagonally1, 1);
        System.out.println("Expected win: Player Two (1): " + isGame4Player2WinDiag);
    }

    public void shouldPlayer1WinByTopRightToBottomLeftDiagonal() {
        int[][] playerTwoWinningGame4Diagonally2 = {
                {-1, -1,  1},
                {-1,  1, -1},
                { 1, -1, -1}};
        boolean isGame5Player2WinDiag = startGame().isWinPositionForDiagonals(playerTwoWinningGame4Diagonally2, 1);
        System.out.println("Expected win: Player Two (1): " + isGame5Player2WinDiag);
    }


    public static void main(String[] args) {
        TicTacToeDemo demo = new TicTacToeDemo();

        System.out.println("Smoke tests:");
        demo.shouldExistEmptyCell();
        demo.shouldNotExistEmptyCell();
        demo.shouldNoOneWin();


        System.out.println("Horizontal tests: ");
        demo.shouldPlayer0WinByHorizontal0();
        demo.shouldPlayer0WinByHorizontal1();
        demo.shouldPlayer0WinByHorizontal2();

        demo.shouldPlayer1WinByHorizontal0();
        demo.shouldPlayer1WinByHorizontal1();
        demo.shouldPlayer1WinByHorizontal2();


        System.out.println("Vertical tests: ");
        demo.shouldPlayer0WinByVertical0();
        demo.shouldPlayer0WinByVertical1();
        demo.shouldPlayer0WinByVertical2();

        demo.shouldPlayer1WinByVertical0();
        demo.shouldPlayer1WinByVertical1();
        demo.shouldPlayer1WinByVertical2();


        System.out.println("Diagonal tests: ");
        demo.shouldPlayer0WinByTopLeftToBottomRightDiagonal();
        demo.shouldPlayer0WinByTopRightToBottomLeftDiagonal();

        demo.shouldPlayer1WinByTopLeftToBottomRightDiagonal();
        demo.shouldPlayer1WinByTopRightToBottomLeftDiagonal();

    }
}
