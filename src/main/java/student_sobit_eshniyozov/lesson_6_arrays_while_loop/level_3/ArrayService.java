package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_3;

class ArrayService {

    public boolean contains(int[] arr, int numberToSearch) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numberToSearch) {
                return true;
            }
            i++;
        }
        return false;
    }

    public int countOccurrences(int[] arr, int numberToSearch) {
        int i = 0;
        int occurrenceNumber = 0;
        while (i < arr.length) {
            if (arr[i] == numberToSearch) {
                occurrenceNumber++;
            }
            i++;
        }
        return occurrenceNumber;
    }

    public boolean replaceFirstNumber(int[] arr, int numberToReplace, int newNumber) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
            i++;
        }
        return false;
    }

    public int replaceAllNumbers(int[] arr, int numberToReplace, int newNumber) {
        int replaceNumbers = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                replaceNumbers++;
            }
            i++;
        }
        return replaceNumbers;
    }

    void revert(int[] arr) {
        int middle = arr.length / 2;
        for (int i = 0; i < middle; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 2 - i] = temp;
        }
    }


}


