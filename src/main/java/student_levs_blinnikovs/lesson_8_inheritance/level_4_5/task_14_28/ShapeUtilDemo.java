package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ShapeUtilDemo {

    void demoCircle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomCircle();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area: " + area + ", perimeter: " + perimeter);
    }

    void demoSquare() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomSquare();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area: " + area + ", perimeter: " + perimeter);
    }

    void demoRectangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomRectangle();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area: " + area + ", perimeter: " + perimeter);
    }

    void demoTriangle() {
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape shape = shapeUtil.createRandomTriangle();
        double area = shapeUtil.calculateArea(shape);
        double perimeter = shapeUtil.calculatePerimeter(shape);
        System.out.println("Area: " + area + ", perimeter: " + perimeter);
    }



    public static void main(String[] args) {

        ShapeUtilDemo demo = new ShapeUtilDemo();
        demo.demoCircle();
        demo.demoSquare();
        demo.demoRectangle();
        demo.demoTriangle();

    }
}
