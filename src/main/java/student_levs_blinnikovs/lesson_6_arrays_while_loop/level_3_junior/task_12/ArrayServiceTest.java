package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12;

public class ArrayServiceTest {

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void shouldContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 2;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        checkTestResult(realResult == expectedResult, "Contains test");
    }

    private void shouldNotContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 4;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        checkTestResult(realResult == expectedResult, "Doesn't contain test");
    }

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContain();
        test.shouldNotContain();
    }
}
