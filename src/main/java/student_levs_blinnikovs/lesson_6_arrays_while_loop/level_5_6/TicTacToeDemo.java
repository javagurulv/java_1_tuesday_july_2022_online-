package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_6;

class TicTacToeDemo {

    public TicTacToe startGame() {
        return new TicTacToe();
    }

    public void printFieldToConsoleDemo() {
        int[][] printingDemoField = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        startGame().printFieldToConsole(printingDemoField);
    }

    public void printDemoResult(String demoMethod, int player, boolean isWin) {
        System.out.println("This is " + demoMethod + " demo. Expected player " + player + " win, actually is: " + isWin);
    }

    public void runHorizontalsDemoSteps(int[][] position, int player) {
        boolean isWin = startGame().isWinPositionForHorizontals(position, player);
        printDemoResult("horizontal", player, isWin);
    }

    public void runVerticalsDemoSteps(int[][] position, int player) {
        boolean isWin = startGame().isWinPositionForVerticals(position, player);
        printDemoResult("vertical", player, isWin);
    }

    public void runDiagonalsDemoSteps(int[][] position, int player) {
        boolean isWin = startGame().isWinPositionForDiagonals(position, player);
        printDemoResult("diagonal", player, isWin);
    }

    public void runEmptyExistsDemoSteps(int[][] position) {
        boolean doesEmptyCellExist = startGame().hasEmptyField(position);
        System.out.println("Empty field exists: " + doesEmptyCellExist);
    }

    public void runEmptyDoesNotExistDemoSteps(int[][] position) {
        boolean doesEmptyFieldNotExist = startGame().hasEmptyField(position);
        System.out.println("Empty field DOES NOT exist: " + !doesEmptyFieldNotExist);
    }

    public void runDrawDemoSteps(int[][] position) {
        boolean isDraw = startGame().isDrawPosition(position);
        System.out.println("Is draw: " + isDraw);
    }

    public void shouldExistEmptyCell() {
        int[][] emptyCellExistsPosition = {
                { 0,  0, -1},
                {-1,  1, -1},
                { 1, -1,  0}
        };
        runEmptyExistsDemoSteps(emptyCellExistsPosition);
    }

    public void shouldNotExistEmptyCell() {
        int[][] emptyCellDoesNotExistPosition = {
                {0, 0, 0},
                {1, 1, 1},
                {0, 1, 1}
        };
        runEmptyDoesNotExistDemoSteps(emptyCellDoesNotExistPosition);
    }

    public void shouldBeDraw() {
        int[][] drawPosition = {
                { 1,  0,  1},
                { 0,  0,  1},
                { 1,  1,  0}
        };
        runDrawDemoSteps(drawPosition);
    }

    public void shouldPlayerWinByHorizontal0(int playerToWin) {
        int[][] position = {
                {playerToWin,   playerToWin,  playerToWin},
                {-1,                -1,                -1},
                {-1,                -1,                -1}
        };
        runHorizontalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByHorizontal1(int playerToWin) {
        int[][] position = {
                {-1,                -1,                -1},
                {playerToWin,   playerToWin,  playerToWin},
                {-1,                -1,               -1}
        };
        runHorizontalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByHorizontal2(int playerToWin) {
        int[][] position = {
                {-1,               -1,                -1},
                {-1,               -1,                -1},
                {playerToWin,  playerToWin,  playerToWin}
        };
        runHorizontalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByVertical0(int playerToWin) {
        int[][] position = {
                {playerToWin, -1, -1},
                {playerToWin, -1, -1},
                {playerToWin, -1, -1}
        };
        runVerticalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByVertical1(int playerToWin) {
        int[][] position = {
                {-1, playerToWin, -1},
                {-1, playerToWin, -1},
                {-1, playerToWin, -1}
        };
        runVerticalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByVertical2(int playerToWin) {
        int[][] position = {
                {-1, -1, playerToWin},
                {-1, -1, playerToWin},
                {-1, -1, playerToWin}
        };
        runVerticalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByTopLeftToBottomRightDiagonal(int playerToWin) {
        int[][] position = {
                {playerToWin,       -1,                -1},
                {-1,            playerToWin,           -1},
                {-1,                -1,       playerToWin}
        };
        runDiagonalsDemoSteps(position, playerToWin);
    }

    public void shouldPlayerWinByTopRightToBottomLeftDiagonal(int playerToWin) {
        int[][] position = {
                {-1,                -1,        playerToWin},
                {-1,            playerToWin,            -1},
                {playerToWin,       -1,                 -1}
        };
        runDiagonalsDemoSteps(position, playerToWin);
    }


    public static void main(String[] args) {
        TicTacToeDemo demo = new TicTacToeDemo();

        System.out.println("Field printing demo: ");
        demo.printFieldToConsoleDemo();

//        System.out.println("\nSmoke tests:");
//        demo.shouldExistEmptyCell();
//        demo.shouldNotExistEmptyCell();
//
//        System.out.println("\nDraw tests:");
//        demo.shouldBeDraw();
//
//        System.out.println("\nHorizontal tests:");
//        demo.shouldPlayerWinByHorizontal0(0);
//        demo.shouldPlayerWinByHorizontal1(0);
//        demo.shouldPlayerWinByHorizontal2(0);
//
//        demo.shouldPlayerWinByHorizontal0(1);
//        demo.shouldPlayerWinByHorizontal1(1);
//        demo.shouldPlayerWinByHorizontal2(1);
//
//        System.out.println("\nVertical tests:");
//        demo.shouldPlayerWinByVertical0(0);
//        demo.shouldPlayerWinByVertical1(0);
//        demo.shouldPlayerWinByVertical2(0);
//
//        demo.shouldPlayerWinByVertical0(1);
//        demo.shouldPlayerWinByVertical1(1);
//        demo.shouldPlayerWinByVertical2(1);
//
//        System.out.println("\nDiagonal tests:");
//        demo.shouldPlayerWinByTopLeftToBottomRightDiagonal(0);
//        demo.shouldPlayerWinByTopRightToBottomLeftDiagonal(0);
//
//        demo.shouldPlayerWinByTopLeftToBottomRightDiagonal(1);
//        demo.shouldPlayerWinByTopRightToBottomLeftDiagonal(1);

    }
}
