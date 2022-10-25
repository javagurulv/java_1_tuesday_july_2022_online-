package student_yurii_panasiuk.lesson_10.level_5_6;

//import teacher.codereview.CodeReview;
//import teacher.codereview.CodeReviewComment;

//@CodeReview(approved = false)
//@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_4.txt")
public class Main_FraudTests {
    public static void main(String[] args) {

        Test_02_Nick_positive.execute();
        Test_01_Nick_negative.execute();

        Test_03_Max_positive.execute();
        Test_04_Max_negative.execute();

}
}