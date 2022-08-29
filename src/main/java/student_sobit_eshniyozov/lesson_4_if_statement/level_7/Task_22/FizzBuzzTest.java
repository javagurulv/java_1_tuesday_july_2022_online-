package student_sobit_eshniyozov.lesson_4_if_statement.level_7.Task_22;

class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest2 = new FizzBuzzTest();
        fizzBuzzTest2.fizzTest();
        fizzBuzzTest2.buzzTest();
        fizzBuzzTest2.fizzBuzzTest();
        fizzBuzzTest2.erorTest();
    }
        void fizzTest(){
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
        void buzzTest(){
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
        void fizzBuzzTest(){
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
        void erorTest(){
            int testNumber = 8;
            String expectedResult = ""+testNumber;
            FizzBuzz fizzBuzz = new FizzBuzz();
            String realResult = fizzBuzz.detect(testNumber);
            if (expectedResult == realResult){
                System.out.println("Number is:" +testNumber);
            }
        }
}
