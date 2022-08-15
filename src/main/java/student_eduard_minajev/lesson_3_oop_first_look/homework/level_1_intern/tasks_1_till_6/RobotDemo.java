package student_eduard_minajev.lesson_3_oop_first_look.homework.level_1_intern.tasks_1_till_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class RobotDemo {
    public static void main(String[] args){
        Robot roby = new Robot("Roby","idle");
        roby.sayHello();
        roby.sayYourName();
        roby.statusReport();

        Robot turbo = new Robot ("Teddy", "idle");
        turbo.sayHello();
        turbo.sayYourName();
        turbo.statusReport();

        Robot hobbit = new Robot ("Frodo","idle");
        hobbit.sayHello();
        hobbit.sayYourName();
        hobbit.statusReport();

        roby.statusChange("Looking at the unknown robot");
        roby.statusReport();
        turbo.statusChange("Looking at the unknown robot");
        turbo.statusReport();
        hobbit.statusChange("Looking at the uknown robot");
        hobbit.statusReport();



        Robot unknown = new Robot ("unknown", "idle");
        unknown.statusChange("looking with red glowing eyes in the dark");
        unknown.statusReport();
        unknown.newNameChange("I'm Terminator T-800 Cyberdyne Systems, Model 1-0-1");
        unknown.saySarahConnor();
        unknown.selfIntroduce();
        unknown.sayComeWithMe();

    };

}
            */