package student_eduard_minajev.lesson_3_oop_first_look.homework.level_1_intern.tasks_1_till_6;

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



        Robot unknow = new Robot ("unknow", "idle");
        unknow.statusChange("looking with red glowing eyes in the dark");
        unknow.statusReport();
        unknow.newNameChange("I'm Terminator T-800 Cyberdyne Systems, Model 1-0-1");
        unknow.saySarahConnor();
        unknow.selfIntroduce();
        unknow.sayComeWithMe();

    };

}
