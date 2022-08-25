package student_sobit_eshniyozov.lesson_3_oop_first_look.level_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Human {

    String myName;

    Human(String myName){
        this.myName=myName;
    }

    void seyMyName() {
        System.out.println(this.myName);
    }
}

