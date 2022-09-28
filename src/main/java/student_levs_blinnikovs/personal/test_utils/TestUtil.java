package student_levs_blinnikovs.personal.test_utils;

public class TestUtil {

    public static void printTestResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void printTestResult(boolean isTestOK, String scenario) {
        if (isTestOK) {
            System.out.println("Test OK for " + scenario + " scenario.");
        } else {
            System.out.println("Test NOT OK for " + scenario + " scenario.");
        }
    }

}
