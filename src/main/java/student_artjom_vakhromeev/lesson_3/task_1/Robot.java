package student_artjom_vakhromeev.lesson_3.task_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Robot {

     String name;

     public Robot(String name) {
         this.name = name;
     }

     void sayHello() {
         System.out.println(this.name +" : Hello!" );
     }
 }