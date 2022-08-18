package student_sobit_eshniyozov.lesson_3.level_5;

public class Dog {
    String nickname;
    int age;
    String color;

    Dog(String nickname, int age, String color) {
        this.nickname = nickname;
        this.age = age;
        this.color = color;
    }
    void voiceNickname() {
        System.out.println("Gaff gaff my nick is " + this.nickname);
    }
    void voiceNicknameAndAge() {
        System.out.println("Gaff gaff my nick is " + this.nickname + ", me " + this.age);
    }
    void happyBirthday() {
        this.age = this.age + 1;
        System.out.println("I celebrate my happy birthday");
    }
    void voiceNicknameAgeAndColor() {
        System.out.println("Gaff gaff my nick is " + this.nickname + ", me " + this.age + ", I am " + this.color);
    }
    void changeColor(String newColor) {
        System.out.println("My color has changed");
        this.color = newColor;
        }

    void voiceNicknameAgeAndNewcolor() {
            System.out.println("Gaff gaff my nick is " + this.nickname + ", me " + this.age + ", I am " + this.color);
    }
}
