package student_sobit_eshniyozov.lesson_4_if_statement.level_1.Task_3;

import java.util.Scanner;

class DaysOfTheWeek {
    int number;
    DaysOfTheWeek(){this.number=number;}

    void showDayOfTheWeek(){
        Scanner day = new Scanner(System.in);
        System.out.println("Write any number: ");
        number = day.nextInt();

        if (number == 1){
            System.out.println("Today is Monday!");
        }
        if (number == 2){
            System.out.println("Today is Tuesday!");
        }
        if (number == 3){
            System.out.println("Today is Wednesday!");
        }
        if (number == 4){
            System.out.println("Today is Thursday!");
        }
        if (number == 5){
            System.out.println("Today is Friday!");
        }
        if (number == 6){
            System.out.println("Today is Saturday!");
        }
        if (number == 7){
            System.out.println("Today is Sunday!");
        }
        if (number < 0 || number > 7){
            System.out.println("EROR!!!");
        }
    }

}
