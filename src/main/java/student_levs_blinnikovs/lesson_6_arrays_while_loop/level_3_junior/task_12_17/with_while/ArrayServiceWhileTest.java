package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17.with_while;

public class ArrayServiceWhileTest {

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
        ArrayServiceWhile arrayService = new ArrayServiceWhile();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        checkTestResult(realResult == expectedResult, "Contains test");
    }

    private void shouldNotContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 4;
        boolean expectedResult = false;
        ArrayServiceWhile arrayService = new ArrayServiceWhile();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        checkTestResult(realResult == expectedResult, "Doesn't contain test");
    }

    private void shouldOccurTwoTimes() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 3;
        int expectedOccurrences = 2;
        ArrayServiceWhile arrayService = new ArrayServiceWhile();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        checkTestResult((realOccurrences == expectedOccurrences), "Occurs twice test");
    }

    private void shouldNotOccur() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 4;
        int expectedOccurrences = 0;
        ArrayServiceWhile arrayService = new ArrayServiceWhile();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        checkTestResult((realOccurrences == expectedOccurrences), "Doesn't occur test");
    }

    public static void main(String[] args) {
        ArrayServiceWhileTest test = new ArrayServiceWhileTest();
        test.shouldContain();
        test.shouldNotContain();
        test.shouldOccurTwoTimes();
        test.shouldNotOccur();
    }
}
