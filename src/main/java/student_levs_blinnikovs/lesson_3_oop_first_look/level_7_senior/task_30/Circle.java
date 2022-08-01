package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_30;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

/*
Разработать класс - круг, у которого должны быть следующие характеристики:
Свойства: радиус (double radius),
Методы: расчет площади (double calculateArea()).

Класс с объявлением фигуры круг должен называться "Circle".
Класс с демонстрацией работы должен называться "CircleDemo".
 */

class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return PI * pow(this.radius, 2);
    }

}

class CircleDemo {

    public static void main(String[] args) {

        Circle smallCircle = new Circle(0.01);
        System.out.println("Small circle area is: " + smallCircle.calculateArea());

        Circle dot = new Circle(0);
        System.out.println("Dot area is: " + dot.calculateArea());

        Circle negativeCircle = new Circle(-1.5);
        System.out.println("Black hole area is: " + negativeCircle.calculateArea());

    }

}
