/* Напишите программу, в которой:
 - создайте массив целых чисел длиной 3; Done
 - заполните каждую ячейку массива числом, запрошенным у пользователя; Done?
 - выведите значение каждой ячейки на консоль. */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import java.util.Scanner;


public class Task11 {

    public static void main(String[] args){

        int [] userArray = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < userArray.length; i++){
            userArray[i]= scanner.nextInt();
            System.out.println(userArray[i]);
        }

    }

}
