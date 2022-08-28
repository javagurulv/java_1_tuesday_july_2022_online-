package student_yurii_panasiuk.lesson_6.level_1_intern;

/*      Напишите тесты для проверки метода isEven(int number).
        Упростите работу метода, код внутри может быть написан в одну строку.

 */

class NumberUtils {

    public static void main(String[] args) {
        System.out.print("Testing method isEven - ");
        isEvenTest();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

     static void isEvenTest() {
        boolean result = isEven(40);
        testResult(result);
    }

    static void testResult(boolean check) {
        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}
    }

}

