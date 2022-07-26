package student_artjom_vakhromeev.lesson_1.Task_11;

import java.util.Scanner;

class SumOfTwoNumbers {
        public static void main(String[] args) {

            int num1, num2, sum;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            num1 = sc.nextInt();

            System.out.println("Enter Second Number: ");
            num2 = sc.nextInt();

            sc.close();
            sum = num1 + num2;
            System.out.println("Sum of these numbers: " + sum);
        }
}


