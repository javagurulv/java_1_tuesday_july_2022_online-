package student_ivan_mostepanov.lesson_3_oop_first_look.level_7_senior.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {

    double radius;
    static final double PI = 3.14159265;
    Circle(double radius){
        this.radius = radius;
    }
    void calculateArea() {
        System.out.println("Radius = " + radius);
        this.radius = PI * (radius * radius);
        System.out.println("Circle area = " + this.radius);

    }
}
