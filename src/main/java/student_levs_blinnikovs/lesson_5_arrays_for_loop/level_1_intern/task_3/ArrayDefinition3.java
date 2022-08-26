package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_1_intern.task_3;

/*
        Найдите ошибку в программе и исправить её.
        Переменная numbers должна ссылаться на массив целых чисел.
 */

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayDefinition3 {

    public static void main(String[] args) {
        int[] numbers = new int[10]; // поменяли ссылку - тип данных должен быть массивом целых чисел []
    }

}

