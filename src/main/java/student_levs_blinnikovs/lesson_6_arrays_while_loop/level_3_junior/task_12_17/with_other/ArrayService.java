package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17.with_other;

class ArrayService {

    public boolean contains(int[] array, int number) {
        for (int element : array) {
            if (element == number) {
                return true;
            }
        }
        return false;
    }

    public int findOccurrences(int[] array, int number) {
        int occurredCount = 0;
        for (int element : array) {
            if (element == number) {
                occurredCount++;
            }
        }
        return occurredCount;
    }

    public boolean replaceFirstOccurrence(int[] array, int numberToFind, int replacingNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                array[i] = replacingNumber;
                return true;
            }
        }
        return false;
    }

}
