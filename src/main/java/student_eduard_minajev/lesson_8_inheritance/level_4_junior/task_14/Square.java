package student_eduard_minajev.lesson_8_inheritance.level_4_junior.task_14;

public class Square extends Shape {

    private double sideLength;

    public Square (String title, double sideLength) {
        super(title);
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        double area = (sideLength * sideLength);
        System.out.println("Area of this square is : " + area);
        return area;
    }


    public double calculatePerimeter() {
        double perimeter = sideLength * 4;
       System.out.println("Perimeter of this square is : " + perimeter);
       return perimeter;
    }

}
