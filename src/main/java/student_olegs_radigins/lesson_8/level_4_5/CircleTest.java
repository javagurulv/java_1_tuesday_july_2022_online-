package student_olegs_radigins.lesson_8.level_4_5;

class CircleTest {
    public static void main(String[] args) {
        CircleTest circleTest = new CircleTest();
        circleTest.areaTest();
        circleTest.perimeterTest();
    }

    public void areaTest() {
        Circle circle = new Circle("Circle", 2);
        double expectedResult = 12.566370614359172;
        if (circle.calculateArea() ==  expectedResult){
            System.out.println("Circle area TEST OK");
        }else {
            System.out.println(" Circle area TEST FALSE");
        }
    }

    public void perimeterTest() {
        Circle circle = new Circle("Circle", 2);
        double expectedResult = 12.566370614359172;
        if (circle.calculatePerimeter() ==  expectedResult){
            System.out.println("Circle perimeter TEST OK");
        }else {
            System.out.println(" Circle perimeter TEST FALSE");
        }
    }



}
