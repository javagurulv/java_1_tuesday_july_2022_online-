package student_jelena_voinica.lesson_4;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[]args){
        Scanner sk = new Scanner(System.in);
        System.out.println("Input two number:");
        int num1 = sk.nextInt();
        int num2 = sk.nextInt();

        if(num1<num2){
            System.out.println("Smallest number:" + num1);
        }
        else
            if(num1>num2){
        System.out.println("Smallest number:" + num2);

           }
    }
}
