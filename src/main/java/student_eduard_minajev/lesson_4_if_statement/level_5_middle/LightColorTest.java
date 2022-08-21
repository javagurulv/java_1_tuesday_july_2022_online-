package student_eduard_minajev.lesson_4_if_statement.level_5_middle;

public class LightColorTest {

    public static void main(String[] args){
        LightColorTest lightColorTest = new LightColorTest();
        lightColorTest.nonVisibleTest();
        lightColorTest.isViolet();
        lightColorTest.isBlue();
        lightColorTest.isGreen();
        lightColorTest.isYellow();
        lightColorTest.isOrgange();
        lightColorTest.isRed();



    }
    public void nonVisibleTest() {
        int wavelenght = 922;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("NonVisibleTest is OK");
        }else {
            System.out.println("NonVisibleTest is FAIL");
        }
    }

    public void isViolet () {
        int wavelenght = 420;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Violet is OK");
        } else {
            System.out.println("Violet is FAIL");

        }
    }
    public void isBlue () {
        int wavelenght = 460;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("I'm Blue! Da-bu-dee Da-bu-die!");
        } else {
            System.out.println("Blue is FAIL");
        }
    }

    public void isGreen () {
        int wavelenght = 550;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Green is OK");
        } else {
            System.out.println("Green is FAIL");
        }
    }

    public void isYellow () {
        int wavelenght = 573;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Yellow is OK");
        } else {
            System.out.println("Yellow is FAIL");
        }
    }

    public void isOrgange () {
        int wavelenght = 610;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Orange is OK");
        } else {
            System.out.println("Orange is FAIL");
        }
    }

    public void isRed () {
        int wavelenght = 666;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelenght);
        if (expectedResult == realResult) {
            System.out.println("Red is OK");
        } else {
            System.out.println("Red is FAIL");
        }
    }



}
