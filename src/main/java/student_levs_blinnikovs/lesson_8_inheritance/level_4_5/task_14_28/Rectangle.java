package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

class Rectangle extends Shape {   // по сути-то Square extends Rectangle ;)

    private double longSide;
    private double shortSide;

    Rectangle(double longSide, double shortSide) {
        super("Rectangle");
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    double calculateArea() {
        return longSide * shortSide;
    }

    double calculatePerimeter() {
        return 2 * (longSide + shortSide);
    }
}
