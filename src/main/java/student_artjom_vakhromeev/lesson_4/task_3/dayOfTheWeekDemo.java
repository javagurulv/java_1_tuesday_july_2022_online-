package student_artjom_vakhromeev.lesson_4.task_3;

import java.util.Scanner;

public class dayOfTheWeekDemo {

    public static void main(String[] args) {


        for (int i = 1; i <= 8; i++) {
            dayOfTheWeek test = new dayOfTheWeek(i);
            test.printDayOfTheWeek();
        }

    }

}