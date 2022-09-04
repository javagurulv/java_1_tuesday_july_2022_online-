package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {

    public TicTacToe startGame() {
        return new TicTacToe();
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

    public void shouldExistEmptyCell() {
        int[][] emptyCellExists = {
                { 0,  0, -1},
                {-1, -1, -1},
                {-1, -1, -1}
        };
        boolean doesEmptyFieldExist = startGame().hasEmptyField(emptyCellExists); // TODO for isWin().. gives false positive results because treats -1 as win. Need to include -1 logic in TicTacToe methods
        System.out.println("Empty field exists: " + doesEmptyFieldExist);
    }

    public void shouldNotExistEmptyCell() {
        int[][] emptyCellDoesNotExist = {
                {0, 0, 0},
                {1, 1, 1},
                {0, 1, 1}};
        boolean doesEmptyFieldDoesNotExist = startGame().hasEmptyField(emptyCellDoesNotExist);
        System.out.println("Empty field DOEST NOT exist: " + !doesEmptyFieldDoesNotExist);
    }

    public void shouldNoOneWin() {
        int[][] position = {
                {-1, -1, -1},
                {-1, -1, -1},
                {-1, -1, -1}};
        boolean isWin = startGame().isWinPosition(position, -1);
        System.out.println("No one wins as field is empty (-1): " + isWin);
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

//        System.out.println("Smoke tests:");
//        demo.shouldExistEmptyCell();
//        demo.shouldNotExistEmptyCell();
//        demo.shouldNoOneWin();

        System.out.println("Horizontal tests:");
        demo.shouldPlayerWinByHorizontal0(0);
        demo.shouldPlayerWinByHorizontal1(0);
        demo.shouldPlayerWinByHorizontal2(0);

        demo.shouldPlayerWinByHorizontal0(1);
        demo.shouldPlayerWinByHorizontal1(1);
        demo.shouldPlayerWinByHorizontal2(1);

        System.out.println("Vertical tests:");
        demo.shouldPlayerWinByVertical0(0);
        demo.shouldPlayerWinByVertical1(0);
        demo.shouldPlayerWinByVertical2(0);

        demo.shouldPlayerWinByVertical0(1);
        demo.shouldPlayerWinByVertical1(1);
        demo.shouldPlayerWinByVertical2(1);

        System.out.println("Diagonal tests:");
        demo.shouldPlayerWinByTopLeftToBottomRightDiagonal(0);
        demo.shouldPlayerWinByTopRightToBottomLeftDiagonal(0);

        demo.shouldPlayerWinByTopLeftToBottomRightDiagonal(1);
        demo.shouldPlayerWinByTopRightToBottomLeftDiagonal(1);

    }
}
