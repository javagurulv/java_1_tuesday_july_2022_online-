package student_olegs_radigins.lesson_8.level_4_5;

class Square extends Shape{
    private double side;

    public Square(String title, double side) {
        super(title);
        this.side = side;
    }

    double calculateArea() {
        return side * side;
    }

    double calculatePerimeter() {
        return side * 4;
    }
}
