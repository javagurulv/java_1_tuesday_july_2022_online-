package student_yurii_panasiuk.lesson_3.level_3;

class Robot {
    String name;
    Robot(String robotName) {
        this.name = robotName; // а тут робот запоминает в своем свойстве this.name как его зовут
    }

     void sayHello() {
        System.out.println("Hello");
    }

     void sayYourName() {
        System.out.println("My name is " + this.name);
    }

}
