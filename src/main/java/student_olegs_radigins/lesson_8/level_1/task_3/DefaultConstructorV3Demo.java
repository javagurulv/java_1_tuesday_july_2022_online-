package student_olegs_radigins.lesson_8.level_1.task_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructorV3Demo {
    public static void main(String[] args) {
        DefaultConstructorV3 defaultConstructorV3 = new DefaultConstructorV3();
        System.out.println(defaultConstructorV3.getFullName());
        System.out.println(defaultConstructorV3.getAge());
        System.out.println(defaultConstructorV3.isFemale());
        System.out.println(defaultConstructorV3.isMale());
    }
}
