package student_levs_blinnikovs.lesson_4_if_statement.level_3_junior.task_9;

class IncreaseDecreaseCheckerDemo {

    public static void main(String[] args) {

        IncreaseDecreaseChecker test1 = new IncreaseDecreaseChecker(1,2,3);
        IncreaseDecreaseChecker test2 = new IncreaseDecreaseChecker(3,2,1);
        IncreaseDecreaseChecker test3 = new IncreaseDecreaseChecker(1,2,1);

        // TODO user input

        System.out.println(test1.checkNumbers());
        System.out.println(test2.checkNumbers());
        System.out.println(test3.checkNumbers());

    }

}
