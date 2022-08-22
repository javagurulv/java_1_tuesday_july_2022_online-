package student_sobit_eshniyozov.lesson_3_oop_first_look.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogDemo {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Simba", 10, "black");
        Dog dog2 = new Dog("Nala", 8,"light brown");

        System.out.println("===========================Dog1=======================================");
        // Task_18;
        dog1.voiceNickname();
        dog1.voiceNickname();
        dog1.voiceNickname();

        // Task_19;
        dog1.voiceNicknameAndAge();

        //Task_20;
        dog1.voiceNicknameAndAge();
        dog1.happyBirthday();
        dog1.voiceNicknameAndAge();

        //Task_21;
        dog1.voiceNicknameAgeAndColor();

        //Task_22;
        dog1.voiceNicknameAgeAndColor();
        dog1.changeColor("brown");
        dog1.voiceNicknameAgeAndColor();

        System.out.println("===========================Dog2=======================================");
        // Task_18;
        dog2.voiceNickname();

        // Task_19;
        dog2.voiceNicknameAndAge();

        //Task_20;
        dog2.voiceNicknameAndAge();
        dog2.happyBirthday();
        dog2.happyBirthday();
        dog2.voiceNicknameAndAge();

        //Task_21;
        dog2.voiceNicknameAgeAndColor();

        //Task_22;
        dog2.voiceNicknameAgeAndColor();
        dog2.changeColor("yellow");
        dog2.happyBirthday();
        dog2.voiceNicknameAgeAndColor();
        System.out.println("===========================To bo continue))=======================================");
    }
}