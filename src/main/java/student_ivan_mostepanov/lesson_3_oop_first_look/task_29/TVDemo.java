package student_ivan_mostepanov.lesson_3_oop_first_look.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
    class TVDemo {

        public static void main(String[] args) {

    TV lg = new TV("LG", "Ultra HD", "WebOS", 42,120, 1205);

    lg.demonstration();
    lg.firmWareUpdate();
    lg.firmWareRollback();
    lg.firmWareReturnToFactory();

        }
}
