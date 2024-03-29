package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_3_junior.task_12_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayService {

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

    public boolean replaceFirstOccurrence(int[] array, int numberToFind, int replacingNumber) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == numberToFind) {
                array[i] = replacingNumber;
                return true;
            }
            i++;
        }
        return false;
    }

    public int replaceAllOccurrences(int[] array, int numberToFind, int replacingNumber) {
        int replaceCount = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == numberToFind) {
                array[i] = replacingNumber;
                replaceCount++;
            }
            i++;
        }
        return replaceCount;
    }

    public void revert(int[] array) {
        int buffer;
        int i = 0;
        while (i < array.length/2) {
            buffer = array[i];
            array[i] = array[array.length-(i+1)];
            array[array.length-(i+1)] = buffer;
            i++;
        }
    }

    public void sort(int[] array) {
        boolean swapped = true;
        int j = 0;
        int buffer;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {
                if (array[i] > array[i + 1]) {
                    buffer = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buffer;
                    swapped = true;
                }
            }
        }
    }

}
