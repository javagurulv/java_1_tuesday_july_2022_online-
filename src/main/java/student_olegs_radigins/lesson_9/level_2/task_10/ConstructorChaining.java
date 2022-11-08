package student_olegs_radigins.lesson_9.level_2.task_10;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ConstructorChaining {
    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        this(constructorName);
        this.parameterCount = parameterCount;
    }
}
