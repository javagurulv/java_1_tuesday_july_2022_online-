package student_olegs_radigins.lesson_4.level_5;

class LightColorDetectorTest {

    public void detectViolet(){
        int wavelength = 400;
        String expectedResult = "Violet";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Violet test = OK");
        } else {
            System.out.println("Violet test = FAIL");
        }
    }

    public void detectBlue(){
        int wavelength = 490;
        String expectedResult = "Blue";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Blue test = OK");
        } else {
            System.out.println("Blue test = FAIL");
        }
    }

    public void detectGreen(){
        int wavelength = 500;
        String expectedResult = "Green";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Green test = OK");
        } else {
            System.out.println("Green test = FAIL");
        }
    }

    public void detectYellow(){
        int wavelength = 580;
        String expectedResult = "Yellow";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Yellow test = OK");
        } else {
            System.out.println("Yellow test = FAIL");
        }
    }

    public void detectOrange(){
        int wavelength = 600;
        String expectedResult = "Orange";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Orange test = OK");
        } else {
            System.out.println("Orange test = FAIL");
        }
    }

    public void detectRed(){
        int wavelength = 700;
        String expectedResult = "Red";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Red test = OK");
        } else {
            System.out.println("Red test = FAIL");
        }
    }

    public void detectInvisibleLight(){
        int wavelength = 100;
        String expectedResult = "Invisible Light";
        LightColorDetector lightColorDetector = new LightColorDetector();
        String realResult = lightColorDetector.detect(wavelength);
        if (realResult == expectedResult) {
            System.out.println("Invisible Light test = OK");
        } else {
            System.out.println("Invisible Light test = FAIL");
        }
    }

    public static void main(String[] args) {
        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();
        lightColorDetectorTest.detectViolet();
        lightColorDetectorTest.detectBlue();
        lightColorDetectorTest.detectGreen();
        lightColorDetectorTest.detectYellow();
        lightColorDetectorTest.detectOrange();
        lightColorDetectorTest.detectRed();
        lightColorDetectorTest.detectInvisibleLight();
    }
}
