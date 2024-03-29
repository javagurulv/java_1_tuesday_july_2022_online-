package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Triangle extends Shape {

     private double side;

     public Triangle(String title, int side) {
         super(title);
         this.side = side;
     }

     public double getSide() {
         return side;
     }

     @Override
     double calculateArea() {
         return ((Math.pow(this.side, 2) * Math.sqrt(3)) / 4);
     }

     @Override
     double calculatePerimeter() {
         return (this.side*3);
     }
 }
