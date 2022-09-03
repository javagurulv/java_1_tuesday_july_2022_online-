package student_eduard_minajev.lesson_6_arrays_while_loop.level_3_junior;

import java.util.Scanner;

public class ArrayService {

    public boolean findDesiredNumber (int [] array, int desiredNumber) {
        for (int i = 0; i < array.length; i++){
            if (array[i] == desiredNumber){
            return true;
            }
        } return false;
    }

    public int countNumberOfAppearance (int [] array, int desiredNumber){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == desiredNumber){
                count = count + 1;
            }
        } return count;
    }
}
