package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_3;
class ArrayServiceTest {

    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContain();
        test.shouldCountOccurrences();
        test.shouldReplaceFirstNumber();
        test.shouldReplaceAllNumbers();


    }

    private void printResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void shouldContain() {
        int[] testArray = {1,2,3};
        int numberToSearch = 3;
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.contains(testArray, numberToSearch);
        printResult(expectedResult==realResult, "Test should Contain");
    }

    private void shouldCountOccurrences() {
        int[] testArray = {1,2,3,3};
        int numberToSearch = 3;
        int expectedResult = 2;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countOccurrences(testArray, numberToSearch);
        printResult((expectedResult==realResult), "Test should Count Occur");
    }
    private void shouldReplaceFirstNumber() {
        int[] testArray = {1,2,3,};
        int numberToReplace = 1;
        int newNumber = 5;
        boolean expectedReplace = true;
        ArrayService arrayService = new ArrayService();
        boolean realReplace = arrayService.replaceFirstNumber(testArray, numberToReplace, newNumber);
        printResult((expectedReplace==realReplace), "Test should replace number");
    }
    private void shouldReplaceAllNumbers() {
        int[] testArray = {1,3,3,};
        int numberToReplace = 3;
        int newNumber = 5;
        int expectedReplace = 2;
        ArrayService arrayService = new ArrayService();
        int realReplace = arrayService.replaceAllNumbers(testArray, numberToReplace, newNumber);
        printResult((expectedReplace==realReplace), "Test should replace all numbers");
    }
}
