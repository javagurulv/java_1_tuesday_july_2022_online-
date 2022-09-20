package student_olegs_radigins.lesson_7.level_1;

class WordServiceTest {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "aa bb ccc bbc bb aa aa";
        String expectedResult = "aa";
        boolean testWordCount = wordService.findMostFrequentWord(text).equals(expectedResult);
        if (testWordCount == true) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test FAIL");
        }
    }
}
