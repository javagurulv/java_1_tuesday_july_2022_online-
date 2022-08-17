package student_ernest_aleskevics.lesson_3.homework.task_19;

public class DogDemo {
    public static void main(String[] args) {
        Dog neo = new Dog ("Neo", 8, "red");
        neo.voice();
        neo.happyBirthday();
        neo.changeColor("black");

        Dog leo = new Dog("Leo", 6, "gray");
        leo.voice();
        leo.happyBirthday();
        neo.changeColor("white");


    }
}
