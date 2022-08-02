package student_levs_blinnikovs.lesson_4_if_statement.level_1_intern.task_3;

class DayOfTheWeekResolverDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            DayOfTheWeekResolver test = new DayOfTheWeekResolver(i);
            test.printDayOfTheWeek();
        }

    }

}