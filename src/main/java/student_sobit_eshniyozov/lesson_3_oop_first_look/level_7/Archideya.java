package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;


// poka v stadiee razrabotki poka mojno ne proveryat!

class Archideya {
    int height;
    int leaves;
    String variety;
    int age;

    Archideya(String variety, int height, int leaves, int age) {
        this.variety = variety;
        this.height = height;
        this.leaves = leaves;
        this.age = age;
    }

    void parameters() {
        System.out.println("The first flower:\n" + "Variety is: " + this.variety + "\nHeight is: " + this.height + "\nNumber of leaves: " + this.leaves + "\nAge of flower: " + this.age);
    }


    /*
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
    */

}
