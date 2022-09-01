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

    private boolean isFieldFilledBy(int[][] field, int playerToCheck) {
        return true; // todo
    }

    private boolean isHorizontalOneFilledBy(int[][] field, int playerToCheck) {
            return field[0][0] == playerToCheck
                && field[0][1] == playerToCheck
                && field[0][2] == playerToCheck;
    }

    private boolean isHorizontalTwoFilledBy(int[][] field, int playerToCheck) {
            return field[1][0] == playerToCheck
                && field[1][1] == playerToCheck
                && field[1][2] == playerToCheck;
    }

    private boolean isHorizontalThreeFilledBy(int[][] field, int playerToCheck) {
            return field[2][0] == playerToCheck
                && field[2][1] == playerToCheck
                && field[2][2] == playerToCheck;
    }

    private boolean isVerticalOneFilledBy(int[][] field, int playerToCheck) {
            return field[0][0] == playerToCheck
                && field[1][0] == playerToCheck
                && field[2][0] == playerToCheck;
    }

    private boolean isVerticalTwoFilledBy(int[][] field, int playerToCheck) {
            return field[0][1] == playerToCheck
                && field[1][1] == playerToCheck
                && field[2][1] == playerToCheck;
    }

    private boolean isVerticalThreeFilledBy(int[][] field, int playerToCheck) {
            return field[0][2] == playerToCheck
                && field[1][2] == playerToCheck
                && field[2][2] == playerToCheck;
    }

    private boolean isDiagonalOneFilledBy(int[][] field, int playerToCheck) {
            return field[0][0] == playerToCheck
                && field[1][1] == playerToCheck
                && field[2][2] == playerToCheck;
    }

    private boolean isDiagonalTwoFilledBy(int[][] field, int playerToCheck) {
            return field[0][2] == playerToCheck
                && field[1][1] == playerToCheck
                && field[2][0] == playerToCheck;
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return isHorizontalOneFilledBy(field, playerToCheck)
                || isHorizontalTwoFilledBy(field, playerToCheck)
                || isHorizontalThreeFilledBy(field, playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return isVerticalOneFilledBy(field, playerToCheck)
                || isVerticalTwoFilledBy(field, playerToCheck)
                || isVerticalThreeFilledBy(field, playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return isDiagonalOneFilledBy(field, playerToCheck)
                || isDiagonalTwoFilledBy(field, playerToCheck);
    }

}
