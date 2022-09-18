package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

public class Triangle extends Shape {

    private double sideLength;

    public Triangle (String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        double area =((Math.sqrt (3) * (Math.pow(sideLength, 2)))/4);
        System.out.println("Area of this triangle is : " + area);
        return area;
    }

    public double calculatePerimeter() {
        double perimeter = sideLength * 3;
        System.out.println("Perimeter of this triangle is : " + perimeter);
        return perimeter;
    }

}
