package student_yurii_panasiuk.lesson_8.level_4.task_14;

 class Rectangle extends Shape {

     private double sideOne;
     private double sideTwo;

     public Rectangle(String title, int side1, int side2) {
         super(title);
         this.sideOne = side1;
         this.sideTwo = side2;
     }

     @Override
     double calculateArea() {
         return (this.sideOne * sideTwo);
     }

     @Override
     double calculatePerimeter() {

         return ((2*this.sideOne) + (2*this.sideTwo));
     }
 }
