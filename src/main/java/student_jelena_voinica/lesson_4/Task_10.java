package student_jelena_voinica.lesson_4;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[]args){
        System.out.println("Enter three number:");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("The biggest is:"+ a +"");
        }
        else if(b>a && b>c){
            System.out.println("The biggest is:"+b+"");
        }
        else {
            System.out.println("The biggest is:"+ c +"");
        }

        }
}