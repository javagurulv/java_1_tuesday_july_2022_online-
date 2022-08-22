package student_ernest_aleskevics.lesson_3.homework.task_1_till_6_robot;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {

        Robot robotOne = new Robot( "robotOne");
        robotOne.sayHello();
        robotOne.sayYourName();

        Robot robotTwo = new Robot("robotTwo");
        robotTwo.sayHello();
        robotTwo.sayYourName();

    }
}
