package student_yurii_panasiuk.lesson_3.level_5_middle.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {

    String nick = "Dog";

    Dog(String nick) {this.nick = nick;}

    public Dog() {

    }

    void voice ()  {System.out.println(nick + " " + nick + " " + nick);}


}
