package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

public class Circle extends Shape {

    private double radius;

    public Circle (String title, double radius){
        super(title);
        this.radius = radius;
    }

    public double calculateArea() {
        final double Pi = 3.14;
        double circleArea = (Pi * (radius * radius));
        System.out.println("The area of circle is : " + circleArea);
        return circleArea;
    }

    public double calculatePerimeter() {
        final double Pi = 3.14;
        double circlePerimeter = 2 * Pi * radius;
        System.out.println("The perimeter of circle is : " + circlePerimeter);
        return circlePerimeter;
    }

}
