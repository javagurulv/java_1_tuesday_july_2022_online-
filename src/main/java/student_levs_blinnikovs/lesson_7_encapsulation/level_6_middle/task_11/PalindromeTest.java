package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_11;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class PalindromeTest {

    public static void main(String[] args) {
        PalindromeTest test = new PalindromeTest();

        test.isPalindromeTest("RaceCar", true);
        test.isPalindromeTest("LEvel", true);
        test.isPalindromeTest("sum sumMuS mus", true);
        test.isPalindromeTest("А роза УПАЛА на лапу Азора", true);

        test.isPalindromeTest("test", false);

    }

    //"racecar", "level", "sum summus mus", "А роза упала на лапу Азора"
    void isPalindromeTest(String stringToTest, boolean expectedIsPalindrome) {
        printTestResult(expectedIsPalindrome == new Palindrome().isPalindrome(stringToTest));
    }

}
