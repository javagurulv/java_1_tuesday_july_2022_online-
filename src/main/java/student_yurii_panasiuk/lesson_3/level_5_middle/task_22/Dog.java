package student_yurii_panasiuk.lesson_3.level_5_middle.task_22;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class DogTask22 {

    String nick = "Dog";
    int dogAge = 1;
    String color = "white";

    DogTask22(String nick, int dogAge, String color) {this.nick = nick; this.dogAge = dogAge; this.color = color;}

	@CodeReviewComment(teacher = "Зачем этот конструктор?")
     DogTask22() {

    }

    void voice ()  {System.out.println (nick + " " + dogAge + " years old " + color);}

    void happyBirthday() {
        dogAge++;
    }

    void changeColor(String newColor) {this.color = newColor;}


}
