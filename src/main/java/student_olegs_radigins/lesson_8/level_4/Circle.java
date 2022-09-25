package student_olegs_radigins.lesson_8.level_4;

class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius *radius;
    }

    double calculatePerimeter() {
        return 2 * radius *Math.PI ;
    }

}
