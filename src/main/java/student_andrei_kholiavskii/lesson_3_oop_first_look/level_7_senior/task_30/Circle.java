package student_andrei_kholiavskii.lesson_3_oop_first_look.level_7_senior.task_30;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "такие числа как число PI в математике являются константами"
		+ "(неизменяемыми значениями). То есть их значение не меняется на протяжении"
		+ "всего времени выполнения программы. Для констант не подходит тот же"
		+ "синтаксис, что и для объявления переменных. Для объявления констант"
		+ "в Java используется следующий синтаксис на уровне класса:"
		+ "static final double NAME_OF_CONSTANT_IN_UPPER_CASE = CONSTANT_VALUE;")
class Circle {

    double radius;
    double pi = 3.14159;
    Circle(double radius) {
        this.radius = radius;}
    void calculateArea() {

        double result = pi * this.radius * this.radius;
        System.out.println("Circle radius is " + this.radius + ". Circle area is " + result);}
}
