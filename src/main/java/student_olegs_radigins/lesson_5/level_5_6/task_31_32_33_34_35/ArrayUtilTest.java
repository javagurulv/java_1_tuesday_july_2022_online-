package student_olegs_radigins.lesson_5.level_5_6.task_31_32_33_34_35;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int arrayLength = 5;
        int[] testArray = arrayUtil.createArray(arrayLength);
        if(testArray.length==arrayLength){
            System.out.println("Array Util test Ok");
        }else {
            System.out.println("Array util test Fail");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        for (int i=0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        if(numbers[4]==arrayUtil.findMaxNumber(numbers)){
            System.out.println("Should find max number test Ok");
        }else {
            System.out.println("Should find max number test Fail");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = arrayUtil.createArray(5);
        for (int i=0; i < numbers.length; i++){
            numbers[i] = 0 - i;
        }
        if(numbers[4]==arrayUtil.findMinNumber(numbers)){
            System.out.println("Should find min number test Ok");
        }else {
            System.out.println("Should find min number test Fail");
        }
    }
}
