package teacher.lesson_4_if_statement.lessoncode.alex.basictestapproach;

public class LightDetectorTest {

    public static void main(String[] args) {
        LightDetectorTest testRunner = new LightDetectorTest();
        testRunner.testRedColor();
        testRunner.testRedColorVar2();
    }

    public void testRedColor() {
        LightDetector subject = new LightDetector();
        int waveLength = 500;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectedResult, actualResult, "Red 1");
    }

    public void testRedColorVar2() {
        LightDetector subject = new LightDetector();
        int waveLength = 401;
        String expectedResult = "Red";
        String actualResult = subject.detect(waveLength);
        check(expectedResult, actualResult, "Red 2");
    }

    public void check(String expectedResult, String actualResult, String name) {
        if (expectedResult == actualResult) {
            System.out.println("Test " + name + " has passed!");
        } else {
            System.out.println("Test " + name + " failed");
            System.out.println("Expected: " + expectedResult + " but actual: " + actualResult);
        }
    }
}
