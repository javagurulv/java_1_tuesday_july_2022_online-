package student_levs_blinnikovs.lesson_11_interfaces.level_1_intern.task_2;

import teacher.codereview.CodeReview;

import java.util.Optional;

@CodeReview(approved = true)
interface ArrayUtil {

    int[] createArray(int arrayLength);

    void fillArrayWithRandomNumbers(int[] array);

    void printArrayToConsole(int[] array);

    Optional<Integer> findMaxNumber(int[] array);

    Optional<Integer> findMinNumber(int[] array);
}
