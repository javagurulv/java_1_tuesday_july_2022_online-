package student_eduard_minajev.lesson_3_oop_first_look.homework.level_1_intern.tasks_1_till_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Robot {

     String name;
     String status;

     Robot(String name, String status) {
         this.name = name;
         this.status = status;
     }
    void sayHello(){
       System.out.println("Hello!");


    }
   void sayYourName(){
         System.out.println("My name is " + this.name);
   }
   void saySarahConnor(){
         System.out.println("Sarah Connor?");
   }
   void sayComeWithMe(){
         System.out.println("Come with me, if you want to live!");
   }
   void selfIntroduce(){
         System.out.println(this.name);
   }
   void statusReport(){
         System.out.println (this.name + " is " + this.status);
   }

   void newNameChange (String NewNameChang) {
       this.name = NewNameChang;
   }
   void statusChange (String NewStatus) {this.status = NewStatus;}





}
