/* - создайте массив целых чисел длиной 3;
 - заполните каждую ячейку массива любым целым числом;
 - выведите значение каждой ячейки на консоль. */



package student_eduard_minajev.lesson_5_arrays_for_loop.homework.level_2_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task10v1 {

    public static void main(String[] args){

        int [] array = new int [3];

        for (int i = 0; i < array.length; i++){
            array[i]= i + 1;
            System.out.println(array[i]);
        }

    }

}
// исправленно