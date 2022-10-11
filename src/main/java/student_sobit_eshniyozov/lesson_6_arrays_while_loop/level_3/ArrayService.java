package student_sobit_eshniyozov.lesson_6_arrays_while_loop.level_3;

public class ArrayService {


   public boolean contains(int[] arr, int numberToSearch){
    int i = 0;
        while (i < arr.length) {
            if (arr[i] == numberToSearch) {
             return true;
            }
            i++;
        }
        return false;
    }
}
