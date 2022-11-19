package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

import java.util.Set;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class UniqueWordFinderTest {

    public static void main(String[] args) {
        UniqueWordFinderTest test = new UniqueWordFinderTest();
        test.shouldReturnAllAsAllAreUniqueWords();
        test.shouldUniqueWords();
        test.testEmptyString();
    }

    void shouldReturnAllAsAllAreUniqueWords() {
        String textWithAllUniqueWords = "This is test string for returning first word as there are no repeated ones.";
        String expectedUniqueWordsString = "[this, is, test, string, for, returning, first, word, as, there, are, no, repeated, ones]";
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> realUniqueWordsStringSet = finder.find(textWithAllUniqueWords);
        String realUniqueWordsString = realUniqueWordsStringSet.toString();
        printTestResult(expectedUniqueWordsString.equals(realUniqueWordsString), "Should return all as all are unique words");
    }

    void shouldUniqueWords() {
        String textWithAllUniqueWords = "Burgers. I just love burgers. Don't you love burgers? Anyone loves burgers!";
        String expectedUniqueWordsString = "[burgers, i, just, love, don, t, you, anyone, loves]";
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> realUniqueWordsStringSet = finder.find(textWithAllUniqueWords);
        String realUniqueWordsString = realUniqueWordsStringSet.toString();
        printTestResult(expectedUniqueWordsString.equals(realUniqueWordsString), "Should return unique words");
    }

    void testEmptyString() {
        String textWithAllUniqueWords = "";
        String expectedUniqueWordsString = "[]";
        UniqueWordFinder finder = new UniqueWordFinder();
        Set<String> realUniqueWordsStringSet = finder.find(textWithAllUniqueWords);
        String realUniqueWordsString = realUniqueWordsStringSet.toString();
        printTestResult(expectedUniqueWordsString.equals(realUniqueWordsString), "Should empty string");
    }

}
