package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PalindromeDemo {

    void demoPrinter(String demoString) {
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(demoString);
        System.out.println("It's " + isPalindrome + " that \"" + demoString + "\" is palindrome.");
    }

    public static void main(String[] args) {

        PalindromeDemo demo = new PalindromeDemo();

        String levelPalindrome = "LEvel";
        String raceCarPalindrome = "RaceCar";
        String latinMultiWordPalindrome = "sum sumMuS mus";
        String cyrillicMultiWordPalindrome = "А роза УПАЛА на лапу Азора";

        String notPalindrome = "test string random";

        demo.demoPrinter(levelPalindrome);
        demo.demoPrinter(raceCarPalindrome);
        demo.demoPrinter(latinMultiWordPalindrome);
        demo.demoPrinter(cyrillicMultiWordPalindrome);

        demo.demoPrinter(notPalindrome);



    }
}
