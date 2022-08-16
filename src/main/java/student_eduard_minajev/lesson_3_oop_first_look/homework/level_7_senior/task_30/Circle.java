package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_30;

 class Circle {

     double radius;

     double area;



     Circle (double radius) {
         this.radius=radius;

     }

     double calculateArea () {
         return this.area = 3.14*((radius)*(radius));
     }

     void provideAnswer () {
         System.out.println(area);
     }


}
