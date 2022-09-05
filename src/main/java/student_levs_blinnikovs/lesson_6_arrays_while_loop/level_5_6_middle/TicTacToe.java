package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_5_6_middle;

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

import java.util.Scanner;

class TicTacToe {

    int[][] field = new int[3][3];
    int playerToCheck;

    public Move getNextMove() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please provide coordinates for your move: ");
        System.out.println("Provide first coordinate \"x\": ");
        int x = userInput.nextInt();
        System.out.println("Provide second coordinate \"y\": ");
        int y = userInput.nextInt();
        return new Move(x, y);
    }

    public void printFieldToConsole(int[][] field) {
        for (int horizontal = 0; horizontal < field.length; horizontal++) {
            System.out.print("\n");
            for (int vertical = 0; vertical < field[horizontal].length; vertical++) {
                System.out.print(field[horizontal][vertical] + " ");
            }
        }
        System.out.print("\n");
    }

    private int[][] returnFieldFilledWithEmptyCells(int[][] field) {
        for (int horizontal = 0; horizontal < field.length; horizontal++) {
            for (int vertical = 0; vertical < field[horizontal].length; vertical++) {
                field[horizontal][vertical] = -1;
            }
        }
        return field;
    }

    public int[][] createField() {
        return returnFieldFilledWithEmptyCells(new int[3][3]);
    }

    public void play() {
        int[][] field = createField();
        while(true) {
            printFieldToConsole(field);
            System.out.println("Player 0 move:");
            Move move0 = getNextMove();
            field[move0.getY()-1][move0.getX()-1] = 0;    // reversed for better usability when entering values. -1 offset so user enter 1 instead of 0 - easier to play
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            System.out.println("Player 1 move:");
            Move move1 = getNextMove();
            field[move1.getY()-1][move1.getX()-1] = 1;  // reversed for better usability when entering values. -1 offset so user enter 1 instead of 0 - easier to play
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    private int getCellPlayerValue(int[][] field, int horizontal, int vertical) {
        return field[horizontal][vertical];
    }

    private boolean isCellFilledBy(int[][] field, int horizontal, int vertical, int playerToCheck) {
        return getCellPlayerValue(field, horizontal, vertical) == playerToCheck;
    }

    private boolean isWinBySpecifiedHorizontal(int[][] field, int playerToCheck, int specifiedHorizontal) {
        boolean isWin = true;
        for (int i = 0; i < field.length; i++) {                     // can do while if needed... Idea offers via code analysis
            if (!isCellFilledBy(field, specifiedHorizontal, i, playerToCheck)) {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

    private boolean isWinBySpecifiedVertical(int[][] field, int playerToCheck, int specifiedVertical) {
        boolean isWin = true;
        for (int i = 0; i < field[0].length; i++) {                 // can do while if needed... Idea offers via code analysis + not sure about field[0]
            if (!isCellFilledBy(field, i, specifiedVertical, playerToCheck)) {
                isWin = false;
                break;
            }
        }
        return isWin;
    }

//    private boolean isWinByTopLeftToBottomRightDiagonal(int[][] field, int playerToCheck) {
//        boolean isWin = true;
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[i].length; j++) {
//                if (!isCellFilledBy(field, i, j, playerToCheck)) {
//                    isWin = false;
//                    break;
//                }
//            }
//        }
//        return isWin;
//    }

    //    private boolean isWinByTopRightToBottomLeftDiagonal(int[][] field, int playerToCheck) {
//        boolean isWin = true;
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[0].length; j++) {
//                if (!isCellFilledBy(field, i, (field[0].length - j), playerToCheck)) {
//                    isWin = false;
//                    break;
//                }
//            }
//        }
//        return isWin;
//    }

    private boolean isWinByTopLeftToBottomRightDiagonal(int[][] field, int playerToCheck) {   // TODO with loops
                return isCellFilledBy(field, 0, 0, playerToCheck)
                    && isCellFilledBy(field, 1, 1, playerToCheck)
                    && isCellFilledBy(field, 2, 2, playerToCheck);
    }

    private boolean isWinByTopRightToBottomLeftDiagonal(int[][] field, int playerToCheck) {   // TODO with loops
            return isCellFilledBy(field, 0, 2, playerToCheck)
                && isCellFilledBy(field, 1, 1, playerToCheck)
                && isCellFilledBy(field, 2, 0, playerToCheck);
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
        for (int vertical = 0; vertical < field[0].length; vertical++) {        // here not sure if this is the best way to get length... but any first level sub-arrays will be same length...
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
        return !(isWinPosition(field, 0) || isWinPosition(field, 1)) && !hasEmptyField(field);
    }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.play();
    }

}
