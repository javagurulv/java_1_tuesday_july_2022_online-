package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class TestUtil {

    static void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

}
