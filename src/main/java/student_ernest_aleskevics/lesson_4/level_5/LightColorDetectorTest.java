package student_ernest_aleskevics.lesson_4.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class LightColorDetectorTest {
    public static void main(String[] args) {

        LightColorDetectorTest lightcolordetectorTest = new LightColorDetectorTest();
        lightcolordetectorTest.violetTest();
        lightcolordetectorTest.blueTest();
        lightcolordetectorTest.greenTest();
        lightcolordetectorTest.yellowTest();
        lightcolordetectorTest.orangeTest();
        lightcolordetectorTest.redTest();
        lightcolordetectorTest.invisiblelightTest();
    }

    public void violetTest(){
        int wavelenght = 430;
        String expectedColor = "Violet";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Violet = OK");
        } else {
            System.out.println("Violet = FAIL");
        }
    }
    public void blueTest(){
        int wavelenght = 460;
        String expectedColor = "Blue";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Blue = OK");
        } else {
            System.out.println("Blue = FAIL");
        }
    }
    public void greenTest(){
        int wavelenght = 500;
        String expectedColor = "Green";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Green = OK");
        } else {
            System.out.println("Green = FAIL");
        }
    }
    public void yellowTest(){
        int wavelenght = 580;
        String expectedColor = "Yellow";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Yellow = OK");
        } else {
            System.out.println("Yellow = FAIL");
        }
    }
    public void orangeTest(){
        int wavelenght = 600;
        String expectedColor = "Orange";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Orange = OK");
        } else {
            System.out.println("Orange = FAIL");
        }
    }
    public void redTest(){
        int wavelenght = 650;
        String expectedColor = "Red";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Red = OK");
        } else {
            System.out.println("Red = FAIL");
        }
    }
    public void invisiblelightTest(){
        int wavelenght = 300;
        String expectedColor = "Invisible light";

        LightColorDetector lightcolordetector = new LightColorDetector();
        String realColor = lightcolordetector.detect(wavelenght);
        if (realColor == expectedColor) {
            System.out.println("Invisible light = OK");
        } else {
            System.out.println("Invisible light = FAIL");
        }
    }

}
