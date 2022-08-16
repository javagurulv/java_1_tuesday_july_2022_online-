package student_sobit_eshniyozov.lesson_3.level_1;

public class Robot {

    String nickname;
    public Robot(String nickname){
        this.nickname=nickname;

    }
    public void sayHello(){
        System.out.println(this.nickname + ": Hello!");
    }

    public void sayYourName() {
        System.out.println(this.nickname + ": My name is "+this.nickname);
    }


    }
