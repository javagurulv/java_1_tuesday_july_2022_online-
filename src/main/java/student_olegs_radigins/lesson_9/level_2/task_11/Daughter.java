package student_olegs_radigins.lesson_9.level_2.task_11;

class Daughter extends Mother{
    int weight;

    public Daughter(int age, int weight) {
        super(age);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Daughter{" +
                "weight=" + weight +
                ", age=" + age +
                '}';
    }
}
