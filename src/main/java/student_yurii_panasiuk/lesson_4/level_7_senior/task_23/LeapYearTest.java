package student_yurii_panasiuk.lesson_4.level_7_senior.task_23;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LeapYearTest {

    public static void main(String[] args) {
        LeapYear test = new LeapYear();

        int firstNumber = 1;  // подготавливаем тестовые данные
        int secondNumber = 4;  // подготавливаем тестовые данные
        int thirdNumber = 100;  // подготавливаем тестовые данные
        int fourthNumber = 400;  // подготавливаем тестовые данные

       /*  // ручной тест
        System.out.println(!test.isLeapYear(firstNumber));
        System.out.println(test.isLeapYear(secondNumber));
        System.out.println(!test.isLeapYear(thirdNumber));
        System.out.println(test.isLeapYear(fourthNumber));
       */

        if (    !test.isLeapYear(firstNumber) &&
                 test.isLeapYear(secondNumber) &&
                !test.isLeapYear(thirdNumber) &&
                 test.isLeapYear(fourthNumber) ) {
            System.out.println("Test = OK");
        }
            else {
            System.out.println("Test = FAIL");
        }
    }

}
