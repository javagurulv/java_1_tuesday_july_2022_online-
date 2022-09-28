package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class ShapeUtilTest {

    Shape[] prepTestArray() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(4);
        shapes[1] = new Square(4);
        shapes[2] = new Rectangle(4, 4);
        shapes[3] = new Triangle(4);
        return shapes;
    }

    void shouldCalculateArea() {
        Shape[] shapes = prepTestArray();
        double expectedCalculatedArea = 89.1936856877122;
        ShapeUtil shapeUtil = new ShapeUtil();
        double realCalculatedArea = shapeUtil.calculateArea(shapes);
        testResultPrinter(expectedCalculatedArea == realCalculatedArea);
    }

    void shouldCalculatePerimeter() {
        Shape[] shapes = prepTestArray();
        double expectedCalculatedPerimeter = 69.13274122871834;
        ShapeUtil shapeUtil = new ShapeUtil();
        double realCalculatedPerimeter = shapeUtil.calculatePerimeter(shapes);
        testResultPrinter(expectedCalculatedPerimeter == realCalculatedPerimeter);
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void main(String[] args) {

        ShapeUtilTest test = new ShapeUtilTest();
        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
