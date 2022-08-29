package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12;

class ArrayService {

    public boolean contains(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

}
