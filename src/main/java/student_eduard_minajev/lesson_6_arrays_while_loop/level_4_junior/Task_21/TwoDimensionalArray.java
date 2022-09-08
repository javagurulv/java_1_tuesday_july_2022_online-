/* оздайте класс TwoDimensionalArray и в нём напишите программу в которой:
- создайте двумерный массив;
- заполните двумерный массив случайными числами;
- посчитайте сумму всех чисел в двумерном массиве.

Помните, что если вы видите часть кода, которую можно реализовать
отдельно от остальной программы, создайте для неё свой метод.
Воспользуйтесь созданным вами методом в основной программе
просто вызвав его. Развивайте и тренируйте умение разбивать
программу на методы на простых задачах, этот навык вам
в дальнейшем поможет справиться с более сложными задачами. */

package student_eduard_minajev.lesson_6_arrays_while_loop.level_4_junior.Task_21;

import java.util.Arrays;
import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class TwoDimensionalArray {
// Гуглил все, так как еще мало опыта с двух мерными массивами
    public static void main(String[] args){
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [] [] newArray = twoDimensionalArray.createTwoDimensionalArray();
        twoDimensionalArray.fillArrayWithRandomNumbers(newArray);
        twoDimensionalArray.printArrayToConsole(newArray);
        twoDimensionalArray.calculateSumOfArray(newArray);

    }
    // шаг 1 - запилим метод который с помощью for нарисует двухмерный массив
    public int [] [] createTwoDimensionalArray (){
        int [] [] array = new int [4] [4];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
            }
        } return array;
    }
    // шаг 2 - заполняем массив произвольными числами
    public int [] [] fillArrayWithRandomNumbers (int [][] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array.length; j++){
               array[i] [j] = random.nextInt(10);
            }
        } return array;
    }
    // доп. шаг - вывести на консоль
    public void printArrayToConsole (int [] [] array){
        System.out.println(Arrays.deepToString(array)); // команду в этот метод гуглил
    }
    // шаг 3 - сумма
    public int calculateSumOfArray (int [] [] array) {
        int sum = 0;
        for (int[] innerArray : array)
            for (int arr : innerArray)
                sum = sum + arr;
        System.out.println(sum);
        return sum;
    }

}



