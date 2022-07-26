package student_eduard_minajev.lesson_3_oop_first_look.homework.level_5_middle;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;


@CodeReview(approved = true)
 class Dog {
    String dogName;
    int dogAge;
    String dogHair;

    Dog (String dogName, int dogAge, String dogHair){
        this.dogName=dogName;
        this.dogAge=dogAge;
        this.dogHair=dogHair;
    }
    String sayDogName() {
        return this.dogName;
    }

    String sayDogHair() {
        return this.dogHair;
    }

    int sayDogAge() {
        return this.dogAge;
    }

    void changeHair(String newDogHair) {
        this.dogHair=newDogHair;
        System.out.println(dogName + " has now " + dogHair + " hair.");
    }

    void celebrateBirthday(){
        this.dogAge=dogAge + 1;
        System.out.println(dogName + " is now " + dogAge + " years old and having an after-party hangover...");
    }

     void dogTellEverything() {
        System.out.println(dogName + " is " + dogAge + " years old and has " + dogHair + " hair.");
    }


}
