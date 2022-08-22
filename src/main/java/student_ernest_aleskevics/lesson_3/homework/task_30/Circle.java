package student_ernest_aleskevics.lesson_3.homework.task_30;


public class Circle {
    double radius;
    Circle (double radius){
        this.radius = radius;
    }
    double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

}
