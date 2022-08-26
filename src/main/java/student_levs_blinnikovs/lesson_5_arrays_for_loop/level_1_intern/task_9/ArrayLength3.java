package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_1_intern.task_9;

//Найдите ошибку в программе и исправить её:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength3 {

    public static void main(String[] args) {
        int[] numbers = new int[2];                   // тут опять же ссылку на массив интов
        System.out.println(numbers.length);          // length не метод, а свойство массива
    }

}

