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
        int buffer;
        for (int i = 0; i < array.length/2; i++) {
            buffer = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = buffer;
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

/*
        int[] array = {4,2,1,3};  needs to become 1 2 3 4

        4 2 1 3   4 is not smaller than 4
        4 2 1 3   2 is smaller than 4, needs to be before it
        2 4 1 3   2 is not smaller than 2
        2 4 1 3   4 is not smaller than 2
        2 4 1 3   1 is smaller than 2, needs to be before it
        1 2 4 3   bla bla
        1 2 4 3   3 is smaller than 4, needs to be before it



 */
