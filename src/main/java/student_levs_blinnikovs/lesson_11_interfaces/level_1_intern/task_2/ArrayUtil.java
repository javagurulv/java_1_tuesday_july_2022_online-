package student_levs_blinnikovs.lesson_11_interfaces.level_1_intern.task_2;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    int findMaxNumber(int[] array);

    int findMinNumber(int[] array);
}
