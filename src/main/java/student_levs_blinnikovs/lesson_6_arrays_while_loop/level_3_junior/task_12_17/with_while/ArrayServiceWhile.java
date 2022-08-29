package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17.with_while;

class ArrayServiceWhile {

    public boolean contains(int[] array, int number) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int findOccurrences(int[] array, int number) {
        int occurredCount = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == number) {
                occurredCount++;
            }
            i++;
        }
        return occurredCount;
    }


}
