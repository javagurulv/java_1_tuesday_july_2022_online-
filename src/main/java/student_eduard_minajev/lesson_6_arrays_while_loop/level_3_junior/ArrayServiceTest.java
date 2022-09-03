package student_eduard_minajev.lesson_6_arrays_while_loop.level_3_junior;



public class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.shouldFindDesiredNumber();
        test.shouldNotFindDesiredNumber();
        test.shouldCountAppearance();
        test.shouldNotCountAppearance();
        test.shouldReplaceFirst();
        test.shouldNotReplaceFirst();
        test.shouldReplaceAllNumbers();
        test.shouldNotReplaceAllNumbers();
        test.shouldReverseArray();

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

    private void shouldNotCountAppearance (){
        int [] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        int expectedResult = 0;
        ArrayService arrayService = new ArrayService();
        int realResult = arrayService.countNumberOfAppearance(arrayTest,9);
        checkTestResult(expectedResult == realResult,"shouldNotCountAppearance");
    }

    private void shouldReplaceFirst () {
        int[] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirstNumber(arrayTest, 2, 15);
        checkTestResult(expectedResult == realResult, "shouldReplaceFirst");
    }

    private void shouldNotReplaceFirst () {
        int[] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceFirstNumber(arrayTest, 9, 5);
        checkTestResult(expectedResult == realResult, "shouldNotReplaceFirst");

    }

    private void shouldReplaceAllNumbers () {
        int[] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        boolean expectedResult = true;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceAllNumbers(arrayTest, 2, 16);
        checkTestResult(expectedResult == realResult, "shouldReplaceAllNumbers");

    }

    private void shouldNotReplaceAllNumbers () {
        int[] arrayTest = {1,4,2,2,5,3,2,7,8,2,6};
        boolean expectedResult = false;
        ArrayService arrayService = new ArrayService();
        boolean realResult = arrayService.replaceAllNumbers(arrayTest, 9, 5);
        checkTestResult(expectedResult == realResult, "shouldNotReplaceAllNumbers");

    }

    private void shouldReverseArray (){
        int[] arrayTest = {1,2,3,4};
        ArrayService arrayService = new ArrayService();
        arrayService.reverseArray(arrayTest);

    }

}
