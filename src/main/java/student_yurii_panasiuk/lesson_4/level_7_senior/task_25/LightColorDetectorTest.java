package student_yurii_panasiuk.lesson_4.level_7_senior.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();

        System.out.print("LightColorDetector test - Violet = ");
        testResult (detector.wavelength(405).equals("Violet"));

        System.out.print("LightColorDetector test - Blue = ");
        testResult(detector.wavelength(475).equals("Blue"));

        System.out.print("LightColorDetector test - Green = ");
        testResult(detector.wavelength(505).equals("Green"));

        System.out.print("LightColorDetector test - Yellow =");
        testResult(detector.wavelength(585).equals("Yellow"));

        System.out.print("LightColorDetector test - Orange = ");
        testResult(detector.wavelength(619).equals("Orange"));

        System.out.print("LightColorDetector test - Red = ");
        testResult(detector.wavelength(620).equals("Red"));

        System.out.print("LightColorDetector test - Invisible Light = ");
        testResult(detector.wavelength(760).equals("Invisible Light"));

    }

    private static void testResult(boolean check) {

        if (check){ System.out.println(" OK");}
        else {System.out.println(" FAIL");}

    }


}