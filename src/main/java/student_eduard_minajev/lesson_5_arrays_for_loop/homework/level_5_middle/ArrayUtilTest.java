package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_5_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    /* Task 32 - done. */

    public void shouldCreateArray() {
        int requiredLength = 10;
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.createArray(requiredLength);
    }

    /* Task 36 - done. Тяжело в учении, легко в бою.... */

    public void shouldFindMaxNumber() {
        int[] testArray = {2, 34, 24, 8, 32};
        ArrayUtil arrayUtil = new ArrayUtil();
        int maxNumber = arrayUtil.findMaxNumber(testArray);
        if (maxNumber == 34) {
            System.out.println("Test Max Ok!");
        } else {
            System.out.println("Я Криворукий!");
        }
    }

    /* Task 38  */
    public void shouldFindMinNumber() {
        int[] testArrayMin = {2, 34, 24, 8, 32};
        ArrayUtil arrayUtilExtra = new ArrayUtil();
        int minNumber = arrayUtilExtra.findMinNumber(testArrayMin);
        if (minNumber == 2) {
            System.out.println("Test Min Ok");
        } else {
            System.out.println("Я Криворукий!");
        }
    }


}