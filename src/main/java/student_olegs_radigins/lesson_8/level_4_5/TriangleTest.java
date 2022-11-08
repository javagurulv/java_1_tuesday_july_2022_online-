package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class TriangleTest {
    public static void main(String[] args) {
       TriangleTest triangleTest = new TriangleTest();
       triangleTest.areaTest();
       triangleTest.perimeterTest();

    }
    public void areaTest() {
        Triangle triangle = new Triangle("Triangle", 2);
        double expectedResult = 1.7320508075688772;
        if (triangle.calculateArea() == expectedResult) {
            System.out.println("Triangle area TEST OK");
        } else {
            System.out.println("Triangle area TEST FALSE");
        }
    }

    public void perimeterTest() {
        Triangle triangle = new Triangle("Triangle", 2);
        double expectedResult =6;
        if (triangle.calculatePerimeter() == expectedResult) {
            System.out.println("Triangle perimeter TEST OK");
        } else {
            System.out.println("Triangle perimeter TEST FALSE");
        }
    }
}
