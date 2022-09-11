package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_11;

class PalindromeTest {

    //"racecar", "level", "sum summus mus", "А роза упала на лапу Азора"

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void isPalindromeTest(String stringToTest, boolean expectedIsPalindrome) {
        testResultPrinter(expectedIsPalindrome == new Palindrome().isPalindrome(stringToTest));
    }

    public static void main(String[] args) {

        PalindromeTest test = new PalindromeTest();

        test.isPalindromeTest("RaceCar", true);
        test.isPalindromeTest("LEvel", true);
        test.isPalindromeTest("sum sumMuS mus", true);
        test.isPalindromeTest("А роза УПАЛА на лапу Азора", true);

        test.isPalindromeTest("test", false);

    }
}
