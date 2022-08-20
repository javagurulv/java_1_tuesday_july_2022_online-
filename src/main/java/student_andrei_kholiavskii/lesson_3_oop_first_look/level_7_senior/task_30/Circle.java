package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_30;

class Circle {

    double radius;
    double pi = 3.14159;
    Circle(double radius) {
        this.radius = radius;}
    void calculateArea() {

        double result = pi * this.radius * this.radius;
        System.out.println("Circle radius is " + this.radius + ". Circle area is " + result);}
}
