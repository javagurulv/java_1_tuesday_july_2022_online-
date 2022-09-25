package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

 class TriangleTest {


     public static void main(String[] args) {

         TriangleTest triangleTest = new TriangleTest();

         triangleTest.triangleAreaTest();

         triangleTest.trianglePerimeterTest();

     }


         void triangleAreaTest () {
             Triangle triangleAreaTest = new Triangle("Test", 2);
             System.out.print("Area Calculation Test Is ");
             testResult (triangleAreaTest.calculateArea() == Math.sqrt(3) );

         }

         void trianglePerimeterTest () {
             Triangle trianglePerimeterTest = new Triangle("Test", 1);
             System.out.print("Perimeter Calculation Test Is ");
             testResult (trianglePerimeterTest.calculatePerimeter() == 3);

         }

         static void testResult(boolean check) {
             if (check) {
                 System.out.println(" OK");
             } else {
                 System.out.println(" FAIL");
             }
         }
    }

