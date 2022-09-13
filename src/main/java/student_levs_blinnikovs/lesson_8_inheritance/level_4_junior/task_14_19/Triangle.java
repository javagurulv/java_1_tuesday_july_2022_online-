package student_levs_blinnikovs.lesson_8_inheritance.level_4_junior.task_14_19;

class Triangle extends Shape {

    private double side;

    Triangle(double side) {
        super("Triangle");
        this.side = side;
    }

    double calculateArea() {
        return (Math.sqrt(3) / 4) * Math.pow(side, 2);
    }

    double calculatePerimeter() {
        return 3 * side;
    }
}
