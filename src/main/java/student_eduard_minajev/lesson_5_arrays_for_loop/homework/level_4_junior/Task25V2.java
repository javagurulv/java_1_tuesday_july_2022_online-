/* Напишите программу, в которой:
- запросите у пользователя с консоли длину массива;
- создайте массив указанной пользователем длины;
- заполните массив числами полученными от пользователя;
- распечатайте на консоль все элементы массива. */

package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_4_junior;

import java.util.Scanner;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class Task25V2 {

    public static void main(String[] args){
        int arrayLength = requestArrayLength();
        int [] newArray = createUserArray(arrayLength);
    }

    public static int requestArrayLength (){
        System.out.println("Please enter array length");
        Scanner userArrayLength = new Scanner(System.in);
        int arrayLength = userArrayLength.nextInt();
        return arrayLength;
    }

	@CodeReviewComment(teacher = "смотри src/main/java/teacher/lesson_5_arrays_for_loop/codereview/CleanCodeWarning_7.txt")
    public static int[] createUserArray (int number){
        int [] userArray = new int[number];
        System.out.println("Please fill in the array");
        Scanner userNumbers = new Scanner(System.in);
        for (int i = 0; i < userArray.length; i++){
            userArray[i] = userNumbers.nextInt();
            System.out.println(userArray[i]);
        } return userArray;

    }

}
