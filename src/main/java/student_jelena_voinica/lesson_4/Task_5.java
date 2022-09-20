package student_jelena_voinica.lesson_4;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1>num2){
            System.out.println("Наибольшее число :"+num1+""); }
        else
            if(num1<num2){
        System.out.println("Наибольшее число :"+num2+"");
            }
        }
}

