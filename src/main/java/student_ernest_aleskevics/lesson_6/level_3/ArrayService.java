package student_ernest_aleskevics.lesson_6.level_3;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayService {

    private boolean contains(int[] array, int numberToSearch) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }
}
