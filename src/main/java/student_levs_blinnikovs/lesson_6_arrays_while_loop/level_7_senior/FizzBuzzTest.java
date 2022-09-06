package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_7_senior;


class FizzBuzzTest {

    public void compareRealExpected(String realResult, String expectedResult) {
        if (realResult.equals(expectedResult)) System.out.println("FizzBuzz test = OK");
        else System.out.println("FizzBuzz test = FAIL");
    }

    public void fizzBuzzTest(int number, String expectedResult) {
        FizzBuzz test = new FizzBuzz();
        String realResult = test.detect(number);
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
