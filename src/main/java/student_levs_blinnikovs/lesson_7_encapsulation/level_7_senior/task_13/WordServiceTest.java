package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_13;

// copied tests from level_1_4.task_1_8 and they are failing for now - returns NOT the first most ofter occurrence, but second, instead. In first TC - returns 'is' (expected 'this'), in third - 'burgers' (expected 'pizza')

class WordServiceTest {

    void shouldReturnFirstWordForNoMostFrequentWords() {
        String textWithNoMostFrequent = "this is test string for returning first word as there are no repeated ones.";
        String expectedMostFrequentWord = "this";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textWithNoMostFrequent);
        testResultPrinter(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldFindMostFrequentWord() {
        String textContainingMostFrequent = "Burgers. I just love burgers. Don't you love burgers? Anyone loves burgers!";
        String expectedMostFrequentWord = "burgers";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMostFrequent);
        testResultPrinter(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldReturnFirstOccurrenceForEquallyFrequentWords() {
        String textContainingMultipleMostFrequentGroups = "Hmm... pizza or burgers? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";
        String expectedMostFrequentWord = "pizza";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMultipleMostFrequentGroups);
        testResultPrinter(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldReturnFirstOccurrenceForEquallyFrequentWordsV2() {
        String textContainingMultipleMostFrequentGroups = "Hmm... burgers or pizza? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";
        String expectedMostFrequentWord = "burgers";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMultipleMostFrequentGroups);
        testResultPrinter(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();

        test.shouldReturnFirstWordForNoMostFrequentWords();
        test.shouldFindMostFrequentWord();
        test.shouldReturnFirstOccurrenceForEquallyFrequentWords();
        test.shouldReturnFirstOccurrenceForEquallyFrequentWordsV2();

    }

}
