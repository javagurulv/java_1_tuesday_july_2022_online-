package student_levs_blinnikovs.lesson_8_inheritance.level_4_5.task_14_28;

class CircleTest {

    void shouldCalculateArea() {
        double expectedArea = 28.274333882308138;
        double realArea = new Circle(3).calculateArea();
        testResultPrinter(expectedArea == realArea);
    }

    void shouldCalculatePerimeter() {
        double expectedPerimeter = 18.84955592153876;
        double realPerimeter = new Circle(3).calculatePerimeter();
        testResultPrinter(expectedPerimeter == realPerimeter);
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    public static void main(String[] args) {

        CircleTest test = new CircleTest();

        test.shouldCalculateArea();
        test.shouldCalculatePerimeter();

    }

}
