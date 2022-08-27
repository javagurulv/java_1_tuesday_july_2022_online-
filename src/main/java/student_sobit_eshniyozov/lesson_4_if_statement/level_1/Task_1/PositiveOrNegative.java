package student_sobit_eshniyozov.lesson_4_if_statement.level_1.Task_1;

import java.util.Scanner;

class PositiveOrNegative {
    int number;

    PositiveOrNegative(){this.number=number;}

    void showPositiveOrNegative(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = sc.nextInt();

        if (number >= 0) {
            System.out.println("Number is Positive!");
        }

        if (number < 0) {
            System.out.println("Number is Negative!");
        }
    }

}
