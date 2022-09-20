package student_olegs_radigins.lesson_8.level_1.task_1;

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
