package student_eduard_minajev.lesson_6_arrays_while_loop.level_3_junior;

public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindDesiredNumber();
        test.shouldNotFindDesiredNumber();
        test.shouldCountAppearance();

    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    private void shouldFindDesiredNumber (){
        ArrayService arrayService = new ArrayService();
        int [] arr = {5};
        boolean expectedResult = true;
        boolean result = arrayService.findDesiredNumber(arr, 5);
        checkTestResult(expectedResult == result,"shouldFindDesiredNumber");
    }

    private void shouldNotFindDesiredNumber (){
        ArrayService arrayService = new ArrayService();
        int [] arr = {1};
        boolean expectedResult = false;
        boolean result = arrayService.findDesiredNumber(arr, 4);
        checkTestResult(expectedResult == result,"shouldNotFindDesiredNumber");
    }

    private void shouldCountAppearance (){
        int [] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        int expectedResult = 4;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countNumberOfAppearance(arrayTest,2);
        checkTestResult(expectedResult == realResult,"shouldCountAppearance");

    }


}
