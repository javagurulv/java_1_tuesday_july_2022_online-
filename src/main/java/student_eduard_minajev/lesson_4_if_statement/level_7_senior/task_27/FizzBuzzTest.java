package student_eduard_minajev.lesson_4_if_statement.level_7_senior.task_27;

public class FizzBuzzTest {

    public static void main(String[] args){

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.simpleTest();



    }

    public void fizzBuzzTest(){
        int testNumber = 15;
        String expectedResult = "FizzBuzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(testNumber);
        if (expectedResult == realResult){
            System.out.println("FizzBuzz OK");
        }else {
            System.out.println("FizzBuzz Fail");
        }
    }

    public void fizzTest(){
        int testNumber = 9;
        String expectedResult = "Fizz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(testNumber);
        if (expectedResult == realResult){
            System.out.println("Fizz OK");
        }else {
            System.out.println("Fizz Fail");
        }
    }

    public void buzzTest (){
        int testNumber = 10;
        String expectedResult = "Buzz";
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(testNumber);
        if (expectedResult == realResult){
            System.out.println("Buzz OK");
        }else {
            System.out.println("Buzz Fail");
        }
    }

    public void simpleTest (){
        int testNumber = 11;
        String expectedResult = "" + testNumber;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String realResult = fizzBuzz.detect(testNumber);
        if (expectedResult == realResult){
            System.out.println("Simple OK");
        }else {
            System.out.println("Simple Fail");
        }
    }

}
