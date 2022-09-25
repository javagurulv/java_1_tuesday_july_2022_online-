package student_yurii_panasiuk.lesson_8.level_4.task_14_19;

 class Circle extends Shape {

     private double radius;

     public Circle(String title, int radius) {
         super(title);
         this.radius = radius;
     }

     double getRadius() {
         return radius;
     }

     @Override
     double calculateArea() {
         return (Math.PI*(Math.pow(this.radius, 2)));
     }

     @Override
     double calculatePerimeter() {
         return (2*Math.PI*this.radius);
     }
 }
