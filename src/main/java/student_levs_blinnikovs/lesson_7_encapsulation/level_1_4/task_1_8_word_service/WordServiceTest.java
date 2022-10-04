package student_levs_blinnikovs.lesson_7_encapsulation.level_1_4.task_1_8_word_service;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class WordServiceTest {

    void shouldReturnFirstWordForNoMostFrequentWords() {
        String textWithNoMostFrequent = "This is test string for returning first word as there are no repeated ones.";
        String expectedMostFrequentWord = "this";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textWithNoMostFrequent);
        printTestResult(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldFindMostFrequentWord() {
        String textContainingMostFrequent = "Burgers. I just love burgers. Don't you love burgers? Anyone loves burgers!";
        String expectedMostFrequentWord = "burgers";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMostFrequent);
        printTestResult(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldReturnFirstOccurrenceForEquallyFrequentWords() {
        String textContainingMultipleMostFrequentGroups = "Hmm... pizza or burgers? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";
        String expectedMostFrequentWord = "pizza";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMultipleMostFrequentGroups);
        printTestResult(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    void shouldReturnFirstOccurrenceForEquallyFrequentWordsV2() {
        String textContainingMultipleMostFrequentGroups = "Hmm... burgers or pizza? Good question. I just love burgers. Don't you love burgers? Are you saying that pizza is more superior? I'm not sure. I haven't got a good pizza in a while.";
        String expectedMostFrequentWord = "burgers";
        WordService wordService = new WordService();
        String realMostFrequentWord = wordService.findMostFrequentWord(textContainingMultipleMostFrequentGroups);
        printTestResult(expectedMostFrequentWord.equals(realMostFrequentWord));
    }

    public static void main(String[] args) {

        WordServiceTest test = new WordServiceTest();

        test.shouldReturnFirstWordForNoMostFrequentWords();
        test.shouldFindMostFrequentWord();
        test.shouldReturnFirstOccurrenceForEquallyFrequentWords();
        test.shouldReturnFirstOccurrenceForEquallyFrequentWordsV2();

    }

}
