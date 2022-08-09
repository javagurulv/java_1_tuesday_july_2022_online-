package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_3;

/*
Написать программу, которая запрашивает у пользователя
целое число от 1 до 7 и выводит на консоль соотметствующий
этому числу день недели.

Пример:
Ввод: 3
Вывод: Wednesday

Ввод: 5
Вывод: Friday
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekResolver {

    int dayOfTheWeek;

    DayOfTheWeekResolver(int dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    void printDayOfTheWeek() {
        switch (dayOfTheWeek) {
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.err.println("NO SUCH DAY!");
        }
    }
}

