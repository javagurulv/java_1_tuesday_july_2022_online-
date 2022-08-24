package student_eduard_minajev.lesson_4_if_statement.level_7_senior.task_23;

public class LeapYearTest {

    public static void main(String[] args){

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testLeapYear();
        leapYearTest.testNonLeapYear();

    }

    public void testLeapYear (){
        int testYear = 1992;
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(testYear);
        if (expectedResult == realResult) {
            System.out.println("LeapYearTest Ok");
        }else {
            System.out.println("LeapYearTest Fail");
        }
    }

    public void testNonLeapYear (){
        int testYear = 1993;
        boolean expectedResult = false;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(testYear);
        if (expectedResult == realResult) {
            System.out.println("Non-LeapYearTest Ok");
        }else {
            System.out.println("Non-LeapYearTest Fail");
        }
    }
}
