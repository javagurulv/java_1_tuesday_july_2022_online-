package student_eduard_minajev.lesson_6_arrays_while_loop.level_3_junior;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ArrayService {

    public boolean findDesiredNumber(int[] array, int desiredNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desiredNumber) {
                return true;
            }
        }
        return false;
    }

    public int countNumberOfAppearance(int[] array, int desiredNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == desiredNumber) {
                count = count + 1;
            }
        }
        return count;
    }

    public boolean replaceFirstNumber(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            if (array[i] == numberToReplace && count < 1) {  // так должно срабатывать при первом появлении числа
                array[i] = newNumber;
                count = count + 1;
                return true;
            }
        }return false;
    }

    public boolean replaceAllNumbers(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }return false;
    }

    void reverseArray(int [] array){
       for (int i = array.length - 1; i >= 0; i--){
           System.out.println(array[i]);
       }
    }

}




