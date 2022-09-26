package student_olegs_radigins.lesson_8.level_4_5;

class Rectangle extends Shape {
    double sideA;
    double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double calculateArea() {
        return sideA * sideB;
    }

    double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }
}
