package student_yurii_panasiuk.lesson_11.level_1.task_3;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface MyList {

     void printListToConsole(List list);

     int addToList(); // незнаю как тут?

     int delFromListInPosition(int positonToSDel);

}
