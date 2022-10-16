package student_yurii_panasiuk.lesson_9.level_2.task_10;

/*
 Создайте в этом классе публичный конструктор с двумя параметрами.
        Внутри этого конструктора первой строкой вызовите приватный
        конструктор с одним параметром.
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_9_objects_equality/codereview/CleanCodeWarning_1.txt")
class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this("test");
        this.parameterCount = parameterCount;
    }
}

