package student_eduard_minajev.lesson_7_encapsulation;

public class WorldServiceTest {

    public static void main(String[] args) {

        WorldServiceTest test = new WorldServiceTest();
        test.shouldGiveWordJedi();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    String text = "Jedi never attacks, protectors Jedi are!";

    private void shouldGiveWordJedi () {
        WordService wordService = new WordService();
        wordService.findMostFrequentWord(text);
        String requiredWord = "Jedi";
        checkTestResult(requiredWord == "Jedi", "shouldGiveWordJedi");
    }
}
