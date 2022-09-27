package student_olegs_radigins.lesson_8.level_1.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DefaultConstructor {
    String name;
    int age;

    public DefaultConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "DefaultConstructor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
