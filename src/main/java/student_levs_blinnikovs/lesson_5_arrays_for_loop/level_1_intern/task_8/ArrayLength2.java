package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_1_intern.task_8;

//Найдите ошибку в программе и исправить её:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ArrayLength2 {

    public static void main(String[] args) {
        int[] numbers = new int[2];           // тут ссылку надо на массив интов
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[1]);        // ссылка на 2 индекс выдаст out of boundaries потому что память массиву задали 2. меняю на 1 что будет второй элемент
    }

}

