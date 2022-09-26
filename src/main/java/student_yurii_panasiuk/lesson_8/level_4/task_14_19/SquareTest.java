package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class SquareTest {


     public static void main(String[] args) {

         SquareTest squareTest = new SquareTest();

         squareTest.squareAreaTest();

         squareTest.squarePerimeterTest();

     }


         void squareAreaTest () {
             Square squareAreaTest = new Square("Test", 1);
             System.out.print("Area Calculation Test Is ");
             testResult (squareAreaTest.calculateArea() == 1 );

         }

         void squarePerimeterTest () {
             Square squarePerimeterTest = new Square("Test", 1);
             System.out.print("Perimeter Calculation Test Is ");
             testResult (squarePerimeterTest.calculatePerimeter() == 4);

         }

         static void testResult(boolean check) {
             if (check) {
                 System.out.println(" OK");
             } else {
                 System.out.println(" FAIL");
             }
         }
    }

