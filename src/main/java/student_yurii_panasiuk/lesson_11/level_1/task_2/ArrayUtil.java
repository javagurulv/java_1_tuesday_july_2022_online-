package student_yurii_panasiuk.lesson_11.level_1.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {


    int[] createArray(int arrayLength);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);

}
