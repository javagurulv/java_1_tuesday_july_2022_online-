/* Пошагово создаём игру крестики нолики.

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

Создать класс TicTacToeTest, написать тесты для разработанного метода. */

package student_eduard_minajev.lesson_6_arrays_while_loop.level_5_middle;

public class TicTacToe {

    int playerOne = 0;
    int playerTwo = 1;

    /* Если я все понял правильно, то ход первого игрока в любую ячейку запишит туда значение 0, а соответственно ход второго игрока
    * внесет в эту ячейку значение 1. Определить, кто победил можно путем сложения значений в ячейках по строкам. Условие для первого игрока, что бы хотя бы в
    * одной строчке сумма всех ячеек была = 0. Аналогично, для второго игрока нужна сумма ячеек хотя бы одной строчки равной 3.
    * Алгоритм я думаю верный, но вот за исполнение в коде поручиться не могу... */

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {

        int rowSum1 = 0;
        for (int row1 = 0; row1 < field.length; row1++) {
            for (int colm1 = 0; colm1 < field.length; colm1++) {
                rowSum1 += field[row1][colm1];
            }
        }

        int rowSum2 = 0;
        for (int row2 = 0; row2 < field.length; row2++) {
            for (int colm2 = 0; colm2 < field.length; colm2++) {
                rowSum2 += field[row2][colm2];
            }
        }

        int rowSum3 = 0;
        for (int row3 = 0; row3 < field.length; row3++) {
            for (int colm3 = 0; colm3 < field.length; colm3++) {
                rowSum3 += field[row3][colm3];
            }
        }

        if ((playerToCheck == 0) && (rowSum1 == 0) || (rowSum2 == 0) || (rowSum3 == 0)) {
            return true;
        } else if ((playerToCheck == 1) && (rowSum1 == 3) || (rowSum2 == 3) || (rowSum3 == 3)) {
            return true;
        } else {
            return false;
        }

    }

    public int [] [] createField (){
        int [] [] newArray = new int [3] [3];
        for (int i = 0; i < newArray.length; i++){
            for (int j = 0; j < newArray.length; j++) {
                newArray[i][j] = -1;
            }
        } return newArray;
    }
}