package student_sobit_eshniyozov.lesson_3.level_3;

public class RobotWithName {

    String name;
    public RobotWithName(String nickname){
        this.name=nickname;
    }
    public void sayHello(){
        System.out.println(this.name + ": Hello!");
    }
    public void sayYourName() {
        System.out.println(this.name + ": My name is "+this.name);

    }

}
