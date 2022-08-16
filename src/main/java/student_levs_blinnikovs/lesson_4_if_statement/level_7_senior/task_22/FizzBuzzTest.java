package student_levs_blinnikovs.lesson_4_if_statement.level_7_senior.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FizzBuzzTest {

    public boolean isRealEqualExpected(String realResult, String expectedResult) {
        return realResult.equals(expectedResult);
    }

    public void compareRealExpected(String realResult, String expectedResult) {
        if (isRealEqualExpected(realResult, expectedResult)) {
            System.out.println("FizzBuzz test = OK");
        } else {
            System.out.println("FizzBuzz test = FAIL");
        }
    }
    public void fizzBuzzTest(int number, String expectedResult) {
        // prep test data
        FizzBuzz test = new FizzBuzz();
        // steps
        String realResult = test.detect(number);
        // check
        compareRealExpected(realResult, expectedResult);
    }

    public static void main(String[] args) {

        FizzBuzzTest test = new FizzBuzzTest();

        test.fizzBuzzTest(3, "Fizz");
        test.fizzBuzzTest(5, "Buzz");
        test.fizzBuzzTest(15, "FizzBuzz");
        test.fizzBuzzTest(4, "4");

    }

}
