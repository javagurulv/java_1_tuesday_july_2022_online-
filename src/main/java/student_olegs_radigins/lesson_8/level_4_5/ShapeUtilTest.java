package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class ShapeUtilTest {

    public static void main(String[] args) {
        ShapeUtilTest shapeUtilTest = new ShapeUtilTest();
        shapeUtilTest.shapeAreaTest();
        shapeUtilTest.shapePerimeterTest();

    }

    public void shapeAreaTest(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = new Circle("Circle",2);
        shape[1] = new Square("Square", 2);
        shape[2] = new Rectangle("Rectangle", 2, 3);
        shape[3] = new Triangle("Triangle", 2);
        double expectedResult = 24.29842142192805;
        if (expectedResult == shapeUtil.calculateArea(shape)){
            System.out.println("Area test OK");
        }else {
            System.out.println("Area test FALSE");
        }
    }
    public void shapePerimeterTest(){
        ShapeUtil shapeUtil = new ShapeUtil();
        Shape[] shape = new Shape[4];
        shape[0] = new Circle("Circle",2);
        shape[1] = new Square("Square", 2);
        shape[2] = new Rectangle("Rectangle", 2, 3);
        shape[3] = new Triangle("Triangle", 2);
        double expectedResult = 36.56637061435917;
        if (expectedResult == shapeUtil.calculatePerimeter(shape)){
            System.out.println("Perimeter test OK");
        }else {
            System.out.println("Perimeter test FAIL");
        }

    }
}






