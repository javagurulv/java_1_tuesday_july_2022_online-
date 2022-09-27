package student_olegs_radigins.lesson_8.level_4_5;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class SquareTest {
    public static void main(String[] args) {
        SquareTest squareTest = new SquareTest();
        squareTest.areaTest();
        squareTest.perimeterTest();
    }

    public void areaTest() {
       Square square = new Square("Square", 2);
        double expectedResult = 4;
        if (square.calculateArea() ==  expectedResult){
            System.out.println("Square area TEST OK");
        }else {
            System.out.println("Square area TEST FALSE");
        }
    }

    public void perimeterTest() {
        Square square= new Square("Square", 2);
        double expectedResult = 8;
        if (square.calculatePerimeter() ==  expectedResult){
            System.out.println("Square perimeter TEST OK");
        }else {
            System.out.println("Square perimeter TEST FALSE");
        }
    }


}
