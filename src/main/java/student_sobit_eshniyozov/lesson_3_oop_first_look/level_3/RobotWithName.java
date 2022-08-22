package student_sobit_eshniyozov.lesson_3_oop_first_look.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class RobotWithName {

    String name;

    RobotWithName(String nickname){
        this.name=nickname;
    }
    void sayHello(){
        System.out.println(this.name + ": Hello!");
    }
    void sayYourName() {
        System.out.println(this.name + ": My name is "+this.name);

    }

}
