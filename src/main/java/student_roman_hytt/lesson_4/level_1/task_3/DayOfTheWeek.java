package student_roman_hytt.lesson_4.level_1.task_3;

import java.util.Scanner;

public class DayOfTheWeek {

    int dayOfTheWeek;

    DayOfTheWeek(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
        Scanner scanner = new Scanner(System.in);
    }


    void  ShowDayOfTheWeek() {
        if (dayOfTheWeek == 1)
            System.out.println("Monday" + dayOfTheWeek);


        }


    }
