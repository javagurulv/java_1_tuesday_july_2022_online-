package student_yurii_panasiuk.lesson_5.level_5_6.task_31_40;

/*Создайте класс ArrayUtilTest.
        В этом классе напишите автоматический тест
        для метода int[] createArray(int arrayLength)
        из предыдущего задания.

 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.printRandomArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

     void shouldCreateArray() {

        int [] testLength = ArrayUtil.createArray(10); // тестовый образец
         System.out.print("Length test is ");
         testResult(testLength.length == 10 );
    }

    void printRandomArray (){
        int [] testFilling = ArrayUtil.createArray(10);
        ArrayUtil.fillArrayWithRandomNumbers(testFilling);
        ArrayUtil.printArrayToConsole(testFilling);

    }

    void shouldFindMaxNumber() {
        System.out.print("\n"+"Max number test is ");
        int [] testFilling = {1, 2, 3, 4, 5, 6};
        testResult((ArrayUtil.findMaxNumber(testFilling)) == 6);
    }

     void shouldFindMinNumber() {
        System.out.print("\n"+"Min number test is ");
        int [] testFilling = {1, 2, 3, 4, 5, 6};
        testResult((ArrayUtil.findMinNumber(testFilling)) == 1);
    }

    static void testResult(boolean check) {
        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}
    }

}