package student_levs_blinnikovs.lesson_7_encapsulation.level_1_4.task_1_8;

class WordServiceDemo {

    public static void main(String[] args) {

        String textWithNoMostFrequent = "This is test string for returning first word as there are no repeated ones.";
        String textContainingMostFrequent = "Burgers. I just love burgers. Don't you love burgers? Anyone loves burgers!";
        String textContainingMultipleMostFrequentGroups = "Hmm... pizza or burgers? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";

        WordService wordService = new WordService();

        String result1 = wordService.findMostFrequentWord(textWithNoMostFrequent); // should return "this"
        System.out.println("\"" + result1 + "\" is the most frequent word.");

        String result2 = wordService.findMostFrequentWord(textContainingMostFrequent); // "burgers"
        System.out.println("\"" + result2 + "\" is the most frequent word.");

        String result3 = wordService.findMostFrequentWord(textContainingMultipleMostFrequentGroups); // "pizza"
        System.out.println("\"" + result3 + "\" is the most frequent word.");

    }
}
