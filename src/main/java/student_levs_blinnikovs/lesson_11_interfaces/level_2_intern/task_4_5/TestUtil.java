package student_levs_blinnikovs.lesson_11_interfaces.level_2_intern.task_4_5;

class TestUtil {

    static void printTestResult(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    static void printTestResult(boolean isTestOK, String scenario) {
        if (isTestOK) {
            System.out.println(scenario + ": test OK");
        } else {
            System.out.println(scenario + ": Test NOT OK!");
        }
    }

}
