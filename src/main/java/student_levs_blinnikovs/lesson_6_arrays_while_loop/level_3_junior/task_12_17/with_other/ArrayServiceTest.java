package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17.with_other;

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

    private void shouldOccurTwoTimes() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 3;
        int expectedOccurrences = 2;
        ArrayService arrayService = new ArrayService();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        checkTestResult((realOccurrences == expectedOccurrences), "Occurs twice test");
    }

    private void shouldNotOccur() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 4;
        int expectedOccurrences = 0;
        ArrayService arrayService = new ArrayService();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        checkTestResult((realOccurrences == expectedOccurrences), "Doesn't occur test");
    }

    private void shouldReplaceFirstOccurrence() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 3;
        int newNumber = 5;
        boolean expectedReplaced = true; // можно конечно ещё потестить что не меняет последний элемент.. int expectedAtIndex4 or expectedSameAfterFirstOccurrence...
        ArrayService arrayService = new ArrayService();
        boolean reallyReplaced = arrayService.replaceFirstOccurrence(testArray, numberToFind, newNumber);
        checkTestResult((reallyReplaced == expectedReplaced), "Replacing first occurrence test");
    }

    private void shouldNotReplaceAsThereAreNoOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 4;
        int newNumber = 5;
        boolean expectedReplaced = false;
        ArrayService arrayService = new ArrayService();
        boolean reallyReplaced = arrayService.replaceFirstOccurrence(testArray, numberToFind, newNumber);
        checkTestResult((reallyReplaced == expectedReplaced), "Shouldn't replace as doesn't occur test");
    }

    private void shouldReplaceAllOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 3;
        int newNumber = 5;
        int expectedReplacedCount = 2;
        ArrayService arrayService = new ArrayService();
        int realReplacedCount = arrayService.replaceAllOccurrences(testArray, numberToFind, newNumber);
        checkTestResult((realReplacedCount == expectedReplacedCount), "Replace two occurrences test");
    }

    private void shouldNotReplaceAllAsThereAreNoOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 4;
        int newNumber = 5;
        int expectedReplacedCount = 0;
        ArrayService arrayService = new ArrayService();
        int realReplacedCount = arrayService.replaceAllOccurrences(testArray, numberToFind, newNumber);
        checkTestResult((realReplacedCount == expectedReplacedCount), "Replace zero occurrences test");
    }

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContain();
        test.shouldNotContain();

        test.shouldOccurTwoTimes();
        test.shouldNotOccur();

        test.shouldReplaceFirstOccurrence();
        test.shouldNotReplaceAsThereAreNoOccurrences();

        test.shouldReplaceAllOccurrences();
        test.shouldNotReplaceAllAsThereAreNoOccurrences();

    }
}
