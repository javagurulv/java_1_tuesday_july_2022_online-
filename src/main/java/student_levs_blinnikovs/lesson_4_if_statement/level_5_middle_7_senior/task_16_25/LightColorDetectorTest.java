package student_levs_blinnikovs.lesson_4_if_statement.level_5_middle_7_senior.task_16_25;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class LightColorDetectorTest {

    public boolean isRealEqualExpected(String realResult, String expectedResult) {
        return realResult.equals(expectedResult);
    }

    public void compareRealExpected(String realColor, String expectedColor) {
        if (isRealEqualExpected(realColor, expectedColor)) {
            System.out.println(expectedColor + " test = OK. \n");
        } else {
            System.out.println(expectedColor + " test = FAIL. Actually is " + realColor + "\n");
        }
    }

    @CodeReviewComment(student = "Better that null safe equals (Objects.equals(realColor, expectedColor) as Idea is suggesting?")
    public void colorTest(int wavelength, String expectedColor) {
        LightColorDetector test = new LightColorDetector();
        String realColor = test.detect(wavelength);
        compareRealExpected(realColor, expectedColor);
    }

    /*
    Найдите способ упростить тесты в LightColorDetectorTest.

    Подсказка: вынесите в отдельный метод проверку
    результата и замените её вызовом метода в каждом тесте. DONE

    Инстанция класса LightColorDetector не имеет состояния,
    она stateless. Найдите в интернете, что такое stateless класс
    в программировании. Найдите способ использовать одну
    инстанцию класса LightColorDetector для всех тестов. DONE
     */

    public static void main(String[] args) {

        LightColorDetectorTest test = new LightColorDetectorTest();

        test.colorTest(400, "Violet");
        test.colorTest(494, "Blue");
        test.colorTest(500, "Green");
        test.colorTest(570, "Yellow");
        test.colorTest(619, "Orange");
        test.colorTest(740, "Red");

        test.colorTest(0, "Invisible Light");
        test.colorTest(751, "Invisible Light");

        // testing incorrect scenarios
        System.out.println("Testing fail scenario: ");
        test.colorTest(400, "Yellow");

    }

}
