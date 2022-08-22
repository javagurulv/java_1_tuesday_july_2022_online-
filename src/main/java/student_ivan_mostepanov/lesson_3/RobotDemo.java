package student_ivan_mostepanov.lesson_3;

public class RobotDemo {

    public static void main(String[] args){

        Robot gundam1 = new Robot("ROBO");
                gundam1.sayHello();
                gundam1.sayYourName();

        Robot gundam2 = new Robot("ROBOCOP");
        gundam2.sayHello();
        gundam2.sayYourName();

        Robot gundam3 = new Robot("TERMINATOR");
        gundam3.sayHello();
        gundam3.sayYourName();

        Robot gundam4 = new Robot("C-3PO");
        gundam4.sayHello();
        gundam4.sayYourName();

        Robot gundam5 = new Robot("R2-D2");
        gundam5.sayHello();
        gundam5.sayYourName();
    }

}
