package student_yurii_panasiuk.lesson_10.level_7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_5.txt")
 class Black_Player extends Players {

     Figures color = Figures.BLACK;

     @Override
     public Figures getColor() { // зачем его переопределять, метод есть в родительском классе?
         return color;
     }
 }
