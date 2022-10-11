package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_3;

public class ArrayServiceTest {


    public static void main(String[] args) {

        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldContain();


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
}
