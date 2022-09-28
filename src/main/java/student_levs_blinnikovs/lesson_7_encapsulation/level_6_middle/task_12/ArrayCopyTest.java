package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_12;

import java.util.Arrays;
import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class ArrayCopyTest {

    public static void main(String[] args) {
        ArrayCopyTest test = new ArrayCopyTest();
        test.shouldCopy();
    }

    // todo fix tests, somehow failing
    void shouldCopy() {
        int[] in = {0, 1, 2, 3, 4};
        int numberFrom = 1;
        int numberTo = 3;
        int[] expectedArray = {1, 2, 3};
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] realArray = arrayCopy.copyInRange(in, numberFrom, numberTo);
        printTestResult(Arrays.equals(expectedArray, realArray));
    }
}
