package student_andrei_kholiavskii.lesson_3_oop_first_look.level_1_intern;

class Robot {
     String robotName;


    public Robot(String robotName) { this.robotName = robotName;}

    public void sayHello() {System.out.println("Hello!");
    }

    public void sayYourName() {System.out.println("My name is " + robotName);}

}
