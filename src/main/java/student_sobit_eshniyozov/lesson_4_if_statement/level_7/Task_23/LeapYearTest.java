package student_sobit_eshniyozov.lesson_4_if_statement.level_7.Task_23;

public class LeapYearTest {
    public static void main(String[] args){

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.testLeapYear();
    }

    public void testLeapYear (){
        int testYear = 2000;
        boolean expectedResult = true;
        LeapYear leapYear = new LeapYear();
        boolean realResult = leapYear.isLeapYear(testYear);
        if (expectedResult == realResult) {
            System.out.println("LeapYearTest Ok");
        }else {
            System.out.println("LeapYearTest Fail");
        }
    }
}
