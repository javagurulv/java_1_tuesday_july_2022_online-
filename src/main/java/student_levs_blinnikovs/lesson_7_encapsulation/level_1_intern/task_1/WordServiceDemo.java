package student_levs_blinnikovs.lesson_7_encapsulation.level_1_intern.task_1;

class WordServiceDemo {

    public static void main(String[] args) {

        String textWithNoMostOften = "This is test string for returning first word as there are no repeated ones.";
        String textContainingMostOften = "Burgers. I just love burgers. Don't you love burgers? Anyone loves burgers!";
        String textContainingTwoMostOftenGroups = "Pizza or burgers? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";

        WordService wordService = new WordService();

        //wordService.splitToWords(textWithNoMostOften);
        wordService.stringInfo(textWithNoMostOften);

        //wordService.splitToWords(textContainingMostOften);
        //wordService.splitToWords(textContainingTwoMostOftenGroups);

        String result1 = wordService.findMostFrequentWord(textWithNoMostOften); // should return "This"
        System.out.println(result1);

        String result2 = wordService.findMostFrequentWord(textContainingMostOften); // "burgers"
        System.out.println(result2);

        String result3 = wordService.findMostFrequentWord(textContainingTwoMostOftenGroups); // "pizza"
        System.out.println(result3);

    }
}
