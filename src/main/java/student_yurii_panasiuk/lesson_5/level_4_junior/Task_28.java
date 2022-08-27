package student_yurii_panasiuk.lesson_5.level_4_junior;

import java.util.Arrays;

/*Напишите программу, в которой:
- создайте массив произвольной длины;
- заполните массив случайными числами;
- распечатайте на консоль все элементы массива;
- найдите наименьшее число в массиве и выведите его на консоль.

 */
public class Task_28 {

    public static void main(String[] args) {

        int randomUpperLevel =10;
        int randomLowerLevel=1;
        Integer[] numbers = new Integer[(int) (Math.random() * randomUpperLevel)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=(int) (randomLowerLevel+Math.random() * randomUpperLevel);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        Arrays.sort(numbers);
        System.out.print("\n"+numbers[0]) ;
    }

}
