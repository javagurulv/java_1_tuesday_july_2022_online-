package student_ivan_mostepanov.lesson_3_oop_first_look.dog;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DogApplication {

    public static void main(String[] args) {

        Dog sharik = new Dog("Sharik" , 10);
        sharik.celebrateHappyBirthday();
        sharik.celebrateHappyBirthday();
        sharik.voice();
        sharik.changeName("Avatar");
        sharik.voice();

        Dog bobik = new Dog("Bobik" , 5);
        bobik.celebrateHappyBirthday();

        Dog barbos = new Dog("Barbosik" , 1);
        barbos.celebrateHappyBirthday();


    }
    Dog maxAge(Dog dog1, Dog dog2){
        return null;
    }


}
