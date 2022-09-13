package student_levs_blinnikovs.lesson_8_inheritance.level_4_junior.task_14_1;

class CircleTest {

    void shouldCalculateArea() {
        testResultPrinter(28.274333882308138 == new Circle(3).calculateArea());
    }

    void shouldCalculatePerimeter() {
        testResultPrinter(18.84955592153876 == new Circle(3).calculatePerimeter());
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
