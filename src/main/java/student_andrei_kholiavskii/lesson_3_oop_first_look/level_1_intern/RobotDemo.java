package student_andrei_kholiavskii.lesson_3_oop_first_look.level_1_intern;

public class RobotDemo {
    public static void main(String[] args) {
       Robot firstRobot = new Robot("Robo");
       firstRobot.sayHello();
       firstRobot.sayYourName();

       Robot secondRobot = new Robot("RoboCop");
       secondRobot.sayHello();
       secondRobot.sayYourName();
    }
}
