package student_jelena_voinica.lesson_2.task_1;


import java.util.Scanner;

public class txt {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1/num2);
        System.out.println(num1*num2);


    }
}
