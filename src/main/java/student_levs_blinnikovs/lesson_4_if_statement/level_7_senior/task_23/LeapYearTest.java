package student_levs_blinnikovs.lesson_4_if_statement.level_7_senior.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class LeapYearTest {

    // https://kalender-365.de/leap-years.php - leap years calendar
    // test data: leap years

    public void compareRealExpected(boolean realData, boolean expectedData) {
        if (realData == expectedData) {
            System.out.print("LeapYear test = OK\n");
        } else {
            System.out.print("LeapYear test = FAIL\n");
        }
    }
    public void leapYearTest(int year, boolean expectedIsLeapYear, String scenario) {
        // prep test data
        LeapYear test = new LeapYear();
        // steps
        boolean realResult = test.isLeapYear(year);
        // check
        System.out.println("\nScenario: " + scenario + ": ");
        System.out.print("Year " + year + " is expected to be leap year: " + expectedIsLeapYear + " and is " + realResult + ", ");
        compareRealExpected(realResult, expectedIsLeapYear);
    }

    public static void main(String[] args) {

        LeapYearTest test = new LeapYearTest();

        // Если год не делится на 4, значит он обычный.
        test.leapYearTest(2022, false, "Doesn't divide by 4");

        // Иначе надо проверить не делится ли год на 100.
        // Если не делится, значит это не столетие и можно сделать вывод, что год високосный.
        test.leapYearTest(2020, true, "Doesn't divide by 100");

        // Если делится на 100, значит это столетие и его следует проверить его делимость на 400.
        test.leapYearTest(1900, false, "Divides by 100 but not by 400");

        // Если год делится на 400, то он високосный.
        test.leapYearTest(2000, true, "Divides by 100 and by 400");

    }

}
