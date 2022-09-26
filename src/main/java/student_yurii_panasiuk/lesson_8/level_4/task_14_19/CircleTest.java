package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class CircleTest {


     public static void main(String[] args) {

       CircleTest circleTest = new CircleTest();

         circleTest.circleAreaTest();

         circleTest.circlePerimeterTest();

     }


         void circleAreaTest () {
            Circle circleAreaTest = new Circle("Test", 1);
             System.out.print("Area Calculation Test Is ");
             testResult (circleAreaTest.calculateArea() == Math.PI );

         }

         void circlePerimeterTest () {
            Circle circlePerimeterTest = new Circle("Test", 1);
             System.out.print("Perimeter Calculation Test Is ");
             testResult (circlePerimeterTest.calculatePerimeter() == 2*Math.PI);

         }

         static void testResult(boolean check) {
             if (check) {
                 System.out.println(" OK");
             } else {
                 System.out.println(" FAIL");
             }
         }
    }

