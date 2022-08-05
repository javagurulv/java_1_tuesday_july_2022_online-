package student_olegs_radigins.lesson_3.level1;

 class Robot {
     String robotName;

     public Robot(String robotName) {
         this.robotName = robotName;
     }

     public void saysHello(){
         System.out.println("Hello");
     }
     public void sayYourName() {
         System.out.println("My name is " + robotName);
     }


 }
