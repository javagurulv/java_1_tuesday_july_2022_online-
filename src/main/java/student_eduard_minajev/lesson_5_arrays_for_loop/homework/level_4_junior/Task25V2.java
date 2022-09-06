/* Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива. */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Scanner;

public class Task25V2 {

    public static void main(String[] args){
        int arrayLength = requestArrayLength();
        int [] newArray = createUserArray(arrayLength);
        fillUserArrayWithUserData(newArray);
        printArrayToConsole(newArray);
    }

    public static int requestArrayLength (){
        System.out.println("Please enter array length");
        Scanner userArrayLength = new Scanner(System.in);
        return userArrayLength.nextInt();
    }

    public static int[] createUserArray (int arrayLength) {
        return new int [arrayLength];
    }

    public static int [] fillUserArrayWithUserData (int [] array){
        System.out.println("Please fill in the array");
        Scanner userNumbers = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = userNumbers.nextInt();
        } return array;
    }


    // исправленно. Создан новый метод для вывода массива в консоль
    public static void printArrayToConsole (int [] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

}
