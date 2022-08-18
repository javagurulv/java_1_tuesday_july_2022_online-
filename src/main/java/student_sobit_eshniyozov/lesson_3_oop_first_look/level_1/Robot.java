package student_sobit_eshniyozov.lesson_3_oop_first_look.level_1;

class Robot {

    String nickname;
    Robot(String nickname){
        this.nickname=nickname;

    }
    void sayHello(){
        System.out.println(this.nickname + ": Hello!");
    }

    void sayYourName() {
        System.out.println(this.nickname + ": My name is "+this.nickname);
    }


    }
