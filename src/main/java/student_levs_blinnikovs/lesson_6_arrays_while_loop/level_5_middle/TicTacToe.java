package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_middle;

/*
Пошагово создаём игру крестики нолики.

Дано поле игры крестики нолики размерностью три на три клетки.
Поле представлено двумерным массивом целых чисел, где:
-1 - это пустая клетка,
0 - это клетка, в которую сделал ход первый игрок;
1 - это клетка, в которую сделал ход второй игрок.

Создайте класс TicTacToe, в этом классе реализуйте
метод для определения является ли данная позиция
победной по горизонталям для указанного игрока.

Метод должен иметь следующую сигнатуру:
public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck).

Поле передаётся в этот метод как первый параметр int[][] field.
Знак игрока (0 или 1) передаётся вторым параметром: int playerToCheck.

Метод должен вернуть:
 - true если в одной из горизонталей есть три подряд клетки
   занятые знаком указанного игрока (int playerToCheck);
 - false иначе.

Создать класс TicTacToeTest, написать тесты для разработанного метода.
 */

class TicTacToe {

    int[][] field = new int[3][3];
    int playerToCheck;

    private boolean isSingleFieldFilledBy(int[][] field, int playerToCheck) {
        return true; // TODO .. field[horizontal][i] == playerToCheck ... field[i][vertical] == playerToCheck
    }

    private boolean isHorizontalFilledBy(int[][] field, int playerToCheck, int horizontal) {
        boolean isHorizontalFilledByPlayer = false;
        for (int i = 0; i < field[horizontal].length; i++) {
            if (field[horizontal][i] == playerToCheck) {
                isHorizontalFilledByPlayer = true;
            };
        }
        return isHorizontalFilledByPlayer;
    }

    private boolean isVerticalFilledBy(int[][] field, int playerToCheck, int vertical) {
        boolean isVerticalFilledByPlayer = false;
        for (int i = 0; i < field.length; i++) {
            if (field[i][vertical] == playerToCheck) {
                isVerticalFilledByPlayer = true;
            };
        }
        return isVerticalFilledByPlayer;
    }

    private boolean isTopLeftToBottomRightDiagonalFilledBy(int[][] field, int playerToCheck) {
        boolean isTopLeftToBottomRightDiagonal = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == playerToCheck) {
                    isTopLeftToBottomRightDiagonal = true;
                }
            }
        }
        return isTopLeftToBottomRightDiagonal;
    }

    private boolean isTopRightToBottomLeftDiagonalFilledBy(int[][] field, int playerToCheck) {
        boolean isTopRightToBottomLeftDiagonal = false;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][field[i].length - j] == playerToCheck) {
                    isTopRightToBottomLeftDiagonal = true;
                }
            }
        }
        return isTopRightToBottomLeftDiagonal;

    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        boolean isWinPositionForHorizontal = false;
        for (int i = 0; i < field.length; i++) {
            if (isHorizontalFilledBy(field, playerToCheck, i)) {
                isWinPositionForHorizontal = true;
            }
        }
        return isWinPositionForHorizontal;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        boolean isWinPositionForVertical = false;
        for (int i = 0; i < field[0].length; i++) {                                      // here not sure if this is best way to get length.. but any first level sub-arays will be same length...
            if (isVerticalFilledBy(field, playerToCheck, i)) {
                isWinPositionForVertical = true;
            }
        }
        return isWinPositionForVertical;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isTopLeftToBottomRightDiagonalFilledBy(field, playerToCheck)
                || isTopRightToBottomLeftDiagonalFilledBy(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

}
