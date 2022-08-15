package student_levs_blinnikovs.lesson_4_if_statement.level_7_senior.task_23;

/*
Написать класс для определения високосный год или нет.

class LeapYear {

    // return true - если год високосный
    // return false - если год обычный
    public boolean isLeapYear(int year) {
        // Если год не делится на 4, значит он обычный.
        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        // Если год делится на 400, то он високосный.
        // Иначе год обычный.
    }

}

Создать класс для тестов LeapYearTest
и покрыть тестами весь функционал класса LeapYear.
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "Можно ли этот код улучшить? Если да то как?")
class LeapYear {

    public boolean isLeapYear(int year) {
        boolean result;
        if (year % 4 != 0) {
            // Если год не делится на 4, значит он обычный.
            result = false;
        } else { // Иначе надо проверить не делится ли год на 100.
            if (year % 100 != 0) {
                // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
                result = true;
            } else { // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
                if (year % 400 == 0) {
                    // Если год делится на 400, то он високосный.
                    result = true;
                } else {
                    // Иначе год обычный.
                    result = false;
                }
            }
        }
        return result;

    }

}
