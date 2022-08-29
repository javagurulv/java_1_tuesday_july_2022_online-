package student_sobit_eshniyozov.lesson_4_if_statement.level_5;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();
    }
    public void violetTest() {
            int number = 388;
            String expectedResult = "Violet";
            LightColorDetector lightColorDetector = new LightColorDetector();
            String realResult = lightColorDetector.detector(number);
            if (expectedResult == realResult) {
                System.out.println("Violet is OK");
            }else {
                System.out.println("Violet is FAIL");
            }
        }
    public void blueTest() {
        int number = 451;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Blue is OK");
        }else {
            System.out.println("Blue is FAIL");
        }
    }
    public void greenTest() {
        int number = 561;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Green is OK");
        }else {
            System.out.println("Green is FAIL");
        }
    }
    public void yellowTest() {
        int number = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Yellow is OK");
        }else {
            System.out.println("Yellow is FAIL");
        }
    }
    public void orangeTest() {
        int number = 591;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Orange is OK");
        }else {
            System.out.println("Orange is FAIL");
        }
    }
    public void redTest() {
        int number = 749;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Red is OK");
        }else {
            System.out.println("Red is FAIL");
        }
    }
    public void invisibleTest() {
        int number = 379;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detector(number);
        if (expectedResult == realResult) {
            System.out.println("Invisible Light is OK");
        }else {
            System.out.println("Invisible Light is FAIL");
        }
    }
}
