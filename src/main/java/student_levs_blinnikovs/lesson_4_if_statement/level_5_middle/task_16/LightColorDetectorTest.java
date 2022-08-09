package student_levs_blinnikovs.lesson_4_if_statement.level_5_middle.task_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class LightColorDetectorTest {

    @CodeReviewComment(student = "Better that null safe equals (Object.equals(realColor, expectedColor) as Idea is suggesting?")
    public void colorTest(int wavelength, String expectedColor) {
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realColor = lightColorDetector.detect(wavelength);
        if (realColor.equals(expectedColor)) { // better that null safe equals (Object.equals(realColor, expectedColor) as Idea is suggesting?
            System.out.println("Color test = OK");
        } else {
            System.out.println("Color test = FAIL");
        }
    }

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.colorTest(400, "Violet");
        lightColorDetectorTest.colorTest(494, "Blue");
        lightColorDetectorTest.colorTest(500, "Green");
        lightColorDetectorTest.colorTest(570, "Yellow");
        lightColorDetectorTest.colorTest(619, "Orange");
        lightColorDetectorTest.colorTest(740, "Red");
        lightColorDetectorTest.colorTest(0, "Invisible Light");

    }

}
