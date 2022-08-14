package student_yurii_panasiuk.lesson_3.level_5_middle.task_19;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
 class DogTask19 {

    String nick = "Dog";
    int dogAge = 1;

	@CodeReviewComment(teacher = "Что делает этот конструктор?")
     DogTask19(String bobik, int i) {
    }

    void DogTask19 (String nick, int dogAge) {this.nick = nick; this.dogAge = dogAge;}


     void voice ()  {System.out.println (nick + " " + dogAge + " years old");}


}
