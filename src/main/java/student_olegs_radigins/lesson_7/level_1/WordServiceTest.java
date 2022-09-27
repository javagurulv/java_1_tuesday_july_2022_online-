package student_olegs_radigins.lesson_7.level_1;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Это всего один сценарий. Для более качественного тестирования нужно тестировать и другие сценарии.")
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
