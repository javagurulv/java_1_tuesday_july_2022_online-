package student_olegs_radigins.lesson_3.level1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotDemo {
    public static void main(String[] args) {
        Robot robot1 = new Robot("robot1");
        robot1.saysHello();
        robot1.sayYourName();

        Robot robot2 = new Robot("robot2");
        robot2.saysHello();
        robot2.sayYourName();
    }
}
