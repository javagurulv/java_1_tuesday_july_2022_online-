package student_ivan_mostepanov.lesson_5_arrays_for_loop.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Task10 {

    public static void main (String[] args) {

        int[] numbers = new int[10];

        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = j+1;
            System.out.println(numbers[j]);
        }

    }

}
