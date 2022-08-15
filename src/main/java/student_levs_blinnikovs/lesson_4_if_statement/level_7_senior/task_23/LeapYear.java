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

@CodeReview(approved = true)
class LeapYear {

	public boolean isLeapYear(int year) {
		return isDividedBy4(year) && !isDividedBy100(year)
			|| isDividedBy4(year) && isDividedBy100(year) && isDividedBy400(year);
    }

	private boolean isDividedBy4(int year) {
		return (year % 4) == 0;
	}

	private boolean isDividedBy100(int year) {
		return (year % 100) == 0;
	}

	private boolean isDividedBy400(int year) {
		return (year % 400) == 0;
	}

}
