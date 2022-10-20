package student_olegs_radigins.lesson_7.level_1;


class WordServiceTest {
    public static void main(String[] args) {
       WordServiceTest wordServiceTest =new WordServiceTest();
       wordServiceTest.printResult(wordServiceTest.positiveResult());
       wordServiceTest.printResult(wordServiceTest.negativeResult());

    }
    boolean positiveResult(){
        WordService wordService = new WordService();
        String text = "aa bb ccc bbc bb aa aa";
        String expectedResult = "aa";
        System.out.println("Positive test:");
        return wordService.findMostFrequentWord(text).equals(expectedResult);

    }

    boolean negativeResult(){
        WordService wordService = new WordService();
        String text = "aa bb ccc bbc bb aa aa";
        String expectedResult = "bb";
        System.out.println("Negative test:");
        return wordService.findMostFrequentWord(text).equals(expectedResult);
    }
    void printResult(boolean result){
        if (result){
            System.out.println("Test OK");
        }else  {
            System.out.println("Test FAIL");

        }
    }
}
