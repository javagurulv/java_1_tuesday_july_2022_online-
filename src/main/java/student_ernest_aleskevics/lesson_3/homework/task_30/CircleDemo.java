package student_ernest_aleskevics.lesson_3.homework.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CircleDemo {

    public static void main(String[] args) {
        Circle circleOne = new Circle (5);
        double area = circleOne.calculateArea();
        System.out.println("Circle area = " + area);
    }
}
