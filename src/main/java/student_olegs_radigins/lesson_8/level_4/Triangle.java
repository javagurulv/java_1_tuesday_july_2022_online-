package student_olegs_radigins.lesson_8.level_4;

class Triangle extends Shape {
    private double sideA;
    private double sideB = sideA;
    private double sideC = sideB;

    public Triangle(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    double calculateArea() {
        return Math.sqrt(3) * sideA *sideA /4;
    }

    double calculatePerimeter() {
        return sideA * 3;
    }
}
