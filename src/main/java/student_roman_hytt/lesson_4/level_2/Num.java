package student_roman_hytt.lesson_4.level_2;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Зачем нужны свойства num1 и num2?")
public class Num {


int maxOfTwo (int num1,int num2){if (num1>num2) return num1; else return num2;
}
int minOfTwo (int num1,int num2){if (num1<num2)return num1;else return num2;}

boolean equalsOrDifferent( int num1, int num2)  {if (num1==num2)return true;
    else return false; }

}
