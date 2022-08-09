package student_levs_blinnikovs.lesson_4_if_statement.level_7_senior.task_23;

class LeapYearTest {

    // https://kalender-365.de/leap-years.php - leap years calendar
    // test data: leap years

    public void compareRealExpected(boolean realData, boolean expectedData) {
        if (realData == expectedData) {
            System.out.println("LeapYear test = OK");
        } else {
            System.out.println("LeapYear test = FAIL");
        }
    }
    public void leapYearTest(int year, boolean expectedIsLeapYear) {
        // prep test data
        LeapYear test = new LeapYear();
        // steps
        boolean realResult = test.isLeapYear(year);
        // check
        compareRealExpected(realResult, expectedIsLeapYear);
    }

    public static void main(String[] args) {

        LeapYearTest test = new LeapYearTest();

        // test data: leap years
        /*
            2008
            2012
            2016
         */

        test.leapYearTest(2008, true);
        test.leapYearTest(2012, true);
        test.leapYearTest(2016, true);

        test.leapYearTest(2022, false);

    }

}
