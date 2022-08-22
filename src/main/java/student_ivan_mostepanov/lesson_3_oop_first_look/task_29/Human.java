package student_ivan_mostepanov.lesson_3_oop_first_look.task_29;

class Human {

    String firstName;
    String lastName;
    String sex;
    int age;
    String hairColor;

    public Human(String firstName, String lastName, String sex, int age, String hairColor) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.hairColor = hairColor;
    }

    void introduction(){
        System.out.println("First Name " + this.firstName);
        System.out.println("Last Name " + this.lastName);
        System.out.println("Sex " + this.sex);
        System.out.println("Age " + this.age);
        System.out.println("Hair Color " + this.hairColor);

    }

    void changingHairColor(String hairColor){
        System.out.println("Changing Hair Color to " + hairColor);
        this.hairColor = hairColor;


    }
    void celebratingHappyBirthday(){
        this.age = this.age + 1;
        System.out.println("John Celebrating Birthday " + this.age);
    }
    void changeName(String newName){
        this.firstName = newName;
        System.out.println("John is changing name to " + newName);


    }
    void changeSex(String newSex){
        this.sex = newSex;
    }

}
