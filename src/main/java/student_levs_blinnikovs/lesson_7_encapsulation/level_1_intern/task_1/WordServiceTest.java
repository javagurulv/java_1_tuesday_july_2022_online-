package student_levs_blinnikovs.lesson_7_encapsulation.level_1_intern.task_1;

class WordServiceTest {

    void shouldReturnFirstWordForNoMostOftenWords() {

    }

    void shouldFindMostOftenWord() {

    }

    void shouldReturnFirstOccurrenceForEquallyOftenWords() {

    }

    boolean testComparator(boolean expectedResult, boolean realResult) {
        return expectedResult == realResult; // TODO TBD what comparison methods to use here
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

        test.shouldReturnFirstWordForNoMostOftenWords();
        test.shouldFindMostOftenWord();
        test.shouldReturnFirstOccurrenceForEquallyOftenWords();

    }

}
