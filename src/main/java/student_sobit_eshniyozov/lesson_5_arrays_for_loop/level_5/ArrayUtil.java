package student_sobit_eshniyozov.lesson_5_arrays_for_loop.level_5;

import java.util.Random;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayUtil {

    public static void main(String[] args) {
        ArrayUtil arrayUntilOne = new ArrayUtil();
        arrayUntilOne.createArray(6);
        arrayUntilOne.createRandomArray(5);
    }
    public int[] createArray(int arrayLength) {

        int[] group = new int[arrayLength];

        for (int i = 0; i<group.length; i++){
            System.out.println(group[i]);
        }
        return group;
    }
    public int[] createRandomArray(int arrayLength) {

        int[] group = new int[arrayLength];

        for (int i = 0; i<group.length; i++){
            Random random = new Random();
            group[i]=random.nextInt(150);
            System.out.println(group[i]);
        }
        return group;
    }


}
