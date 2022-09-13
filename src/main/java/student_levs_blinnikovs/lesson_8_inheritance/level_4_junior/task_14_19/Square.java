package student_levs_blinnikovs.lesson_8_inheritance.level_4_junior.task_14_19;

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
