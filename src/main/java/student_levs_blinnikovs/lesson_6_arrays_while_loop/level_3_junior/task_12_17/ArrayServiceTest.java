package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17;

import java.util.Arrays;

import teacher.codereview.CodeReview;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

@CodeReview(approved = true)
public class ArrayServiceTest {

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

        test.shouldRevertEven();
        test.shouldRevertOdd();

        test.shouldSort();
        test.shouldNotSortSorted();

    }

    private void shouldContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 2;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        printTestResult(realResult == expectedResult, "Contains test");
    }

    private void shouldNotContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 4;
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        printTestResult(realResult == expectedResult, "Doesn't contain test");
    }

    private void shouldOccurTwoTimes() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 3;
        int expectedOccurrences = 2;
        ArrayService arrayService = new ArrayService();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        printTestResult((realOccurrences == expectedOccurrences), "Occurs twice test");
    }

    private void shouldNotOccur() {
        int[] testArray = {1,2,3,3};
        int numberToOccur = 4;
        int expectedOccurrences = 0;
        ArrayService arrayService = new ArrayService();
        int realOccurrences = arrayService.findOccurrences(testArray, numberToOccur);
        printTestResult((realOccurrences == expectedOccurrences), "Doesn't occur test");
    }

    private void shouldReplaceFirstOccurrence() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 3;
        int newNumber = 5;
        boolean expectedReplaced = true; // можно конечно ещё потестить что не меняет последний элемент.. int expectedAtIndex4 or expectedSameAfterFirstOccurrence...
        ArrayService arrayService = new ArrayService();
        boolean reallyReplaced = arrayService.replaceFirstOccurrence(testArray, numberToFind, newNumber);
        printTestResult((reallyReplaced == expectedReplaced), "Replacing first occurrence test");
    }

    private void shouldNotReplaceAsThereAreNoOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 4;
        int newNumber = 5;
        boolean expectedReplaced = false;
        ArrayService arrayService = new ArrayService();
        boolean reallyReplaced = arrayService.replaceFirstOccurrence(testArray, numberToFind, newNumber);
        printTestResult((reallyReplaced == expectedReplaced), "Shouldn't replace as doesn't occur test");
    }

    private void shouldReplaceAllOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 3;
        int newNumber = 5;
        int expectedReplacedCount = 2;
        ArrayService arrayService = new ArrayService();
        int realReplacedCount = arrayService.replaceAllOccurrences(testArray, numberToFind, newNumber);
        printTestResult((realReplacedCount == expectedReplacedCount), "Replace two occurrences test");
    }

    private void shouldNotReplaceAllAsThereAreNoOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToFind = 4;
        int newNumber = 5;
        int expectedReplacedCount = 0;
        ArrayService arrayService = new ArrayService();
        int realReplacedCount = arrayService.replaceAllOccurrences(testArray, numberToFind, newNumber);
        printTestResult((realReplacedCount == expectedReplacedCount), "Replace zero occurrences test");
    }

    private void shouldRevertEven() {
        int[] testArray = {1,2,3,4};
        int[] expectedRevertedArray = {4,3,2,1};
        ArrayService arrayService = new ArrayService();
        arrayService.revert(testArray);
        printTestResult((Arrays.equals(testArray, expectedRevertedArray)), "Revert even array test");
    }

    private void shouldRevertOdd() {
        int[] testArray = {1,2,3,4,5};
        int[] expectedRevertedArray = {5,4,3,2,1};
        ArrayService arrayService = new ArrayService();
        arrayService.revert(testArray);
        printTestResult((Arrays.equals(testArray, expectedRevertedArray)), "Revert odd array test");
    }

    private void shouldSort() {
        int[] testArray = {4,2,1,3};
        int[] expectedSortedArray = {1,2,3,4};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(testArray);
        printTestResult((Arrays.equals(testArray, expectedSortedArray)), "Sort array test");
    }

    private void shouldNotSortSorted() {
        int[] testArray = {1,2,3,4};
        int[] expectedSortedArray = {1,2,3,4};
        ArrayService arrayService = new ArrayService();
        arrayService.sort(testArray);
        printTestResult((Arrays.equals(testArray, expectedSortedArray)), "Shouldn't sort sorted array test");
    }

}
