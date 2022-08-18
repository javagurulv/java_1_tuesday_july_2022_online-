package student_sobit_eshniyozov.lesson_3_oop_first_look.level_3;

class RobotWithNameDemo {
    public static void main(String[] args) {

        RobotWithName Robot1 = new RobotWithName("Mashuko");
        Robot1.sayHello();
        Robot1.sayYourName();

        RobotWithName Robot2 = new RobotWithName("Optimus");
        Robot2.sayHello();
        Robot2.sayYourName();

        RobotWithName Robot3 = new RobotWithName("Terminator");
        Robot3.sayHello();
        Robot3.sayYourName();

    }
}
