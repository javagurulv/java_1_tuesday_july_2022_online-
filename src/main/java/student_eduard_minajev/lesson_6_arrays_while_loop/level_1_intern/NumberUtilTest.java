package student_eduard_minajev.lesson_6_arrays_while_loop.level_1_intern;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
public class NumberUtilTest {

    public static void main(String[] args){
        NumberUtilTest check = new NumberUtilTest();
        check.isEvenTest();


    }

	@CodeReviewComment(teacher = "смотри src/main/java/teacher/lesson_6_arrays_while_loop/codereview/CleanCodeWarning_3.txt")
    public boolean isEvenTest (){
        int checkNumber = 8;
        boolean expectedResult = true;
        NumberUtils numberUtils = new NumberUtils();
        boolean actualResult = numberUtils.isEven(checkNumber);
        if (actualResult == expectedResult) {System.out.println("Test Ok");
        } return true;
    }

}
