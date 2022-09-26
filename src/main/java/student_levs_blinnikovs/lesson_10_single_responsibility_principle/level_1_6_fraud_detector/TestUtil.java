package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

class TestUtil {

    static void printTestResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

}
