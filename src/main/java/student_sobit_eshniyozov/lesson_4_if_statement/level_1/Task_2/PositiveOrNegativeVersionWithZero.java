package student_sobit_eshniyozov.lesson_4_if_statement.level_1.Task_2;


//        Написать программу, которая запрашивает у пользователя
//        целое число и выводит на консоль
//        положительное оно, отрицательное или равно нулю.

import java.util.Scanner;

class PositiveOrNegativeVersionWithZero {
        int number;
    PositiveOrNegativeVersionWithZero(){this.number=number;}
        void showPositiveOrNegativeVersionWithZero(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Write any number: ");
            number = sc.nextInt();

            if (number > 0) {
                System.out.println("Number is Positive!");
            }

            if (number < 0) {
                System.out.println("Number is Negative!");
            }

            if (number == 0) {
                System.out.println("Number is Zero!");
            }
        }
}
