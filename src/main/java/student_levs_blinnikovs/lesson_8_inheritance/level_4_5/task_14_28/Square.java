package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

class Square extends Shape {

    private double side;

    Square(double side) {
        super("Square");
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return 4 * side;
    }
}
