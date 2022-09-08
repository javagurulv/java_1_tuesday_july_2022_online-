package student_eduard_minajev.lesson_6_arrays_while_loop.level_7_senior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class FizzBuzzTest {

    public static void main(String[] args) {
    FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
    fizzBuzzTest.shouldReturnFizzBuzz();
    fizzBuzzTest.shouldReturnFizz();
    fizzBuzzTest.shouldReturnBuzz();
    fizzBuzzTest.shouldReturnNumber();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    public void shouldReturnFizzBuzz (){
        FizzBuzzSimplified test = new FizzBuzzSimplified();
        String fizzBuzz = test.detect(15);
        checkTestResult("FizzBuzz".equals(fizzBuzz),"shouldReturnFizzBuzz");
    }

    public void shouldReturnFizz () {
        FizzBuzzSimplified test = new FizzBuzzSimplified();
        String fizzBuzz = test.detect(3);
        checkTestResult("Fizz".equals(fizzBuzz),"shouldReturnFizz");
    }

    public void shouldReturnBuzz () {
        FizzBuzzSimplified test = new FizzBuzzSimplified();
        String fizzBuzz = test.detect(5);
        checkTestResult("Buzz".equals(fizzBuzz),"shouldReturnBuzz");
    }

    public void shouldReturnNumber () {
        FizzBuzzSimplified test = new FizzBuzzSimplified();
        String fizzBuzz = test.detect(17);
        checkTestResult("17".equals(fizzBuzz),"shouldReturnNumber");
    }


}
