package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        int[][] noOneWinningGame = {{-1, -1, -1},
                                    {-1, -1, -1},
                                    {-1, -1, -1}};

        int emptyField = -1;
        boolean noOneWins = game.isWinPositionForHorizontals(noOneWinningGame, emptyField);
        System.out.println("No one wins as field is empty (-1): " + noOneWins);

    }
}
