package student_yurii_panasiuk.lesson_5.level_5_6.task_31_32;

/*Создайте класс ArrayUtilTest.
        В этом классе напишите автоматический тест
        для метода int[] createArray(int arrayLength)
        из предыдущего задания.

 */

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.printRandomArray();

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






    static void testResult(boolean check) {

        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}

    }

}