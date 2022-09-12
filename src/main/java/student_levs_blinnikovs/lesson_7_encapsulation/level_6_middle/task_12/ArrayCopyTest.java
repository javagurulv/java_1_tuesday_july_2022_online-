package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_12;

import java.util.Arrays;

class ArrayCopyTest {

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void shouldCopy() {
        int[] in = {0, 1, 2, 3, 4};
        int numberFrom = 1;
        int numberTo = 3;
        int[] expectedArray = {1, 2, 3};
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] realArray = arrayCopy.copyInRange(in, numberFrom, numberTo);
        testResultPrinter(Arrays.equals(expectedArray, realArray));
    }

    public static void main(String[] args) {

        ArrayCopyTest test = new ArrayCopyTest();

        test.shouldCopy();

    }


}
