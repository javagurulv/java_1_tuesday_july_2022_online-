package student_ivan_mostepanov.lesson_3_oop_first_look.task_29;

class HumanDemo {


    public static void main(String[] args) {

        Human john = new Human("John", "Rowling", "Male", 32, "Black");

john.introduction();
john.celebratingHappyBirthday();
john.changingHairColor("red");
john.changeName("Joanne");
john.changeSex("Female");

        john.introduction();
    }
}
