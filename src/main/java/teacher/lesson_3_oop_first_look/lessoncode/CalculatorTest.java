package teacher.lesson_3_oop_first_look.lessoncode;

class CalculatorTest {

    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(10, 10);
        if (actualResult == 20) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

    public static void test2() {
        Calculator calculator = new Calculator();
        int actualResult = calculator.sum(10, -10);
        if (actualResult == 0) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 1 = FAIL");
        }
    }

}
