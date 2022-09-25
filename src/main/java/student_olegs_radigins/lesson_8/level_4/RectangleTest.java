package student_olegs_radigins.lesson_8.level_4;

class RectangleTest {
    public static void main(String[] args) {
        RectangleTest rectangleTest = new RectangleTest();
        rectangleTest.areaTest();
        rectangleTest.perimeterTest();
    }

    public void areaTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        double expectedResult = 6;
        if (rectangle.calculateArea() == expectedResult) {
            System.out.println("Rectangle area TEST OK");
        } else {
            System.out.println("Rectangle area TEST FALSE");
        }
    }

    public void perimeterTest() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 3);
        double expectedResult = 10;
        if (rectangle.calculatePerimeter() == expectedResult) {
            System.out.println("Rectangle perimeter TEST OK");
        } else {
            System.out.println("Rectangle perimeter TEST FALSE");
        }
    }
}