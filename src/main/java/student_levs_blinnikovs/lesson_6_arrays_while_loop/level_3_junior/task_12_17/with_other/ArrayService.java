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

    public int replaceAllOccurrences(int[] array, int numberToFind, int replacingNumber) {
        int replaceCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                array[i] = replacingNumber;
                replaceCount++;
            }
        }
        return replaceCount;
    }

    public void revert(int[] array) {
        int buffer1;
        int buffer2;
        for (int i = 0; i < array.length/2; i++) {
            buffer1 = array[i];
            buffer2 = array[array.length-1-i];
            array[i] = buffer2;
            array[array.length-1-i] = buffer1;
        }
    }
}
