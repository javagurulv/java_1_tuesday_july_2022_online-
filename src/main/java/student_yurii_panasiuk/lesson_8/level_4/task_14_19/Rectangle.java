package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Rectangle extends Shape {

     private double sideOne;
     private double sideTwo;

     public Rectangle(String title, int side1, int side2) {
         super(title);
         this.sideOne = side1;
         this.sideTwo = side2;
     }

     public double getSideOne() {
         return sideOne;
     }

     public double getSideTwo() {
         return sideTwo;
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
