package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

 class Square extends Shape {

     private double side;

     public double getSide() {
         return side;
     }

     public Square(String title, int side) {
         super(title);
         this.side = side;
     }

     @Override
     double calculateArea() {
         return (Math.pow(this.side, 2));
     }

     @Override
     double calculatePerimeter() {
         return (4*this.side);
     }
 }
