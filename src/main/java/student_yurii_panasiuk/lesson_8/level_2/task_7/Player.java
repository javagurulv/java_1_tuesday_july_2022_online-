package student_yurii_panasiuk.lesson_8.level_2.task_7;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Зачем в классе HumanPlayer свойство name?")
class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    String name;

     HumanPlayer(String name) {
        super(name);

    }

}