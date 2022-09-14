package student_levs_blinnikovs.lesson_7_encapsulation.level_5_middle.task_9;

class PowerCalculatorTest {

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void shouldCalculatePower(int base, int power, int expectedResult) {
        PowerCalculator powerCalculator = new PowerCalculator();
        int realResult = powerCalculator.power(base, power);
        testResultPrinter(expectedResult == realResult);
    }

    public static void main(String[] args) {

        PowerCalculatorTest test = new PowerCalculatorTest();

        test.shouldCalculatePower(2,2,4);
        test.shouldCalculatePower(2,3,8);
        test.shouldCalculatePower(2,4,16);
        test.shouldCalculatePower(2,5,32);
        test.shouldCalculatePower(2,6,64);
        test.shouldCalculatePower(2,7,128);
        test.shouldCalculatePower(2,8,256);
        test.shouldCalculatePower(2,9,512);
        test.shouldCalculatePower(2,10,1024);

        test.shouldCalculatePower(3,2,9);
        test.shouldCalculatePower(3,3,27);
        test.shouldCalculatePower(3,4,81);

        test.shouldCalculatePower(1,1,1);
        test.shouldCalculatePower(1,100,1);

        test.shouldCalculatePower(1, 0, 1);
        // by math rules any base to power of 0 should return 1 but works incorrectly... need to make some logic
        test.shouldCalculatePower(100, 0, 1); // wrong...

        test.shouldCalculatePower(0, 1, 0);
        test.shouldCalculatePower(0, 100, 0);


    }
}
