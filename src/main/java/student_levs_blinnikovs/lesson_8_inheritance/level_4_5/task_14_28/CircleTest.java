package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class CircleTest {

    void shouldCalculateArea() {
        double expectedArea = 28.274333882308138;
        double realArea = new Circle(3).calculateArea();
        printTestResult(expectedArea == realArea);
    }

    void shouldCalculatePerimeter() {
        double expectedPerimeter = 18.84955592153876;
        double realPerimeter = new Circle(3).calculatePerimeter();
        printTestResult(expectedPerimeter == realPerimeter);
    }

    public static void main(String[] args) {

        CircleTest test = new CircleTest();

        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
