package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class RectangleTest {


     public static void main(String[] args) {

         RectangleTest rectangleTest = new RectangleTest();

         rectangleTest.rectangleAreaTest();

         rectangleTest.rectanglePerimeterTest();

     }


         void rectangleAreaTest () {
             Shape rectangleAreaTest = new Rectangle("Test", 1, 2); // Shape
             System.out.print("Area Calculation Test Is ");
             testResult (rectangleAreaTest.calculateArea() == 2 );

         }

         void rectanglePerimeterTest () {
             Shape rectanglePerimeterTest = new Rectangle("Test", 1, 2);
             System.out.print("Perimeter Calculation Test Is ");
             testResult (rectanglePerimeterTest.calculatePerimeter() == 6);

         }

         static void testResult(boolean check) {
             if (check) {
                 System.out.println(" OK");
             } else {
                 System.out.println(" FAIL");
             }
         }
    }

