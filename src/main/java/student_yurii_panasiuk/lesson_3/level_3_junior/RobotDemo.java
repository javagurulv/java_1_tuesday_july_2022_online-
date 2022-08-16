package student_yurii_panasiuk.lesson_3.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {

    public static void main(String[] args) {

        Robot robot1 = new Robot ("Rider");
        robot1.sayHello();
        robot1.sayYourName();

        Robot robot2;
        robot2 = new Robot ("John");
        robot2.sayHello();
        robot2.sayYourName();
            }

}
