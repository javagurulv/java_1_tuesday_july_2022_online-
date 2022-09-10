package student_levs_blinnikovs.lesson_7_encapsulation.level_1_intern.task_1;

class WordService {

    // TODO ideas here void for now, later update return type

    String[] splitToWords(String text) {
        return text.toLowerCase().split("\\W+");
    }

    void stringInfo(String text) {
        String[] words = splitToWords(text);
        System.out.println("There are total " + words.length + " words in the sentence: ");
        for (int i = 0; i < words.length; i++) {
            System.out.println((i + 1) + ": " + words[i]);
        }
    }


    void runSomeMethodOnCollectionAndReturnMostOften(String[] strings) {

    }



    public String findMostFrequentWord(String text) {



        return "";
    }

}
