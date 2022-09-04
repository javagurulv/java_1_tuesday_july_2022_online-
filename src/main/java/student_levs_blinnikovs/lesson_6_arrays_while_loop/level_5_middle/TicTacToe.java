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

    private int getCellPlayerValue(int[][] field, int indexOne, int indexTwo) {
        return field[indexOne][indexTwo];
    }

    private boolean isCellFilledBy(int[][] field, int indexOne, int indexTwo, int playerToCheck) {
        return getCellPlayerValue(field, indexOne, indexTwo) == playerToCheck;
    }

    private boolean isWinBySpecifiedHorizontal(int[][] field, int playerToCheck, int horizontal) {
        for (int i = 0; i < field[horizontal].length; i++) {
            if (isCellFilledBy(field, horizontal, i, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinBySpecifiedVertical(int[][] field, int playerToCheck, int vertical) {
        for (int i = 0; i < field.length; i++) {
            if (isCellFilledBy(field, i, vertical, playerToCheck)) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinByTopLeftToBottomRightDiagonal(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (isCellFilledBy(field, i, j, playerToCheck)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isWinByTopRightToBottomLeftDiagonal(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (isCellFilledBy(field, i, (field[i].length - j), playerToCheck)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int horizontal = 0; horizontal < field.length; horizontal++) {
            if (isWinBySpecifiedHorizontal(field, playerToCheck, horizontal)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int vertical = 0; vertical < field[0].length; vertical++) {        // here not sure if this is best way to get length.. but any first level sub-arays will be same length...
            if (isWinBySpecifiedVertical(field, playerToCheck, vertical)) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
            return isWinByTopLeftToBottomRightDiagonal(field, playerToCheck)
                || isWinByTopRightToBottomLeftDiagonal(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
            return isWinPositionForHorizontals(field, playerToCheck)
                || isWinPositionForVerticals(field, playerToCheck)
                || isWinPositionForDiagonals(field, playerToCheck);
    }

    public boolean hasEmptyField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (isCellFilledBy(field, i, j, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDrawPosition(int[][] field) {
            return !(isWinPosition(field, this.playerToCheck) && hasEmptyField(field));
    }

}
