package student_yurii_panasiuk.lesson_4.level_7_senior.task_25;

class LightColorDetectorTest {
    public static void main(String[] args) {
        LightColorDetector detector = new LightColorDetector();

        if(detector.wavelength(405).equals("Violet")) {
            System.out.println("LightColorDetector test - Violet = OK");
        } else {
            System.out.println("LightColorDetector test - Violet = FAIL");
        }

        if(detector.wavelength(475).equals("Blue")) {
            System.out.println("LightColorDetector test - Blue = OK");
        } else {
            System.out.println("LightColorDetector test - Blue = FAIL");
        }

        if(detector.wavelength(505).equals("Green")) {
            System.out.println("LightColorDetector test - Green = OK");
        } else {
            System.out.println("LightColorDetector test - Green = FAIL");
        }

        if(detector.wavelength(585).equals("Yellow")) {
            System.out.println("LightColorDetector test - Yellow = OK");
        } else {
            System.out.println("LightColorDetector test - Yellow = FAIL");
        }

        if(detector.wavelength(619).equals("Orange")) {
            System.out.println("LightColorDetector test - Orange = OK");
        } else {
            System.out.println("LightColorDetector test - Orange = FAIL");
        }

        if(detector.wavelength(620).equals("Red")) {
            System.out.println("LightColorDetector test - Red = OK");
        } else {
            System.out.println("LightColorDetector test - Red = FAIL");
        }

        if(detector.wavelength(760).equals("Invisible Light")) {
            System.out.println("LightColorDetector test - Invisible Light = OK");
        } else {
            System.out.println("LightColorDetector test - Invisible Light = FAIL");
        }

    }


}