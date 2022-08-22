package student_olegs_radigins.lesson_3.level7.task_30;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Circle {
    double radius;


     Circle(double radius){
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    void printCalculatedArea() {
         System.out.println("Area of a circle= " + calculateArea());
     }


}
