package student_levs_blinnikovs.lesson_7_encapsulation.level_6_middle.task_11;

class Palindrome {

//    boolean isPalindrome(String text) {
//        char[] chars = text.toLowerCase().toCharArray();
//        for (int i = 0; i < chars.length / 2; i++) {
//            if (chars[i] == chars[chars.length - (i + 1)]) {
//                System.out.println(chars[i] + " equals " + chars[chars.length - (i + 1)]);
//            }
//        }
//        return true;
//    }

    boolean isPalindrome(String text) {
        char[] chars = text.replace(" ", "").toLowerCase().toCharArray();   // here replace() used, otherwise cyrillic phrase is not palindrome...
        for (int i = 0; i < chars.length; i++) {                                // is it worth here to run all length or (length / 2) instead?
            if (!(chars[i] == chars[chars.length - (i + 1)])) {
                return false;
            }
        }
        return true;
    }
}
