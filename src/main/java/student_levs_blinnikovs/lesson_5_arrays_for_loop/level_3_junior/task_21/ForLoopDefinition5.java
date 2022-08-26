package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_3_junior.task_21;

// Найдите логическую ошибку в программе и исправить её:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopDefinition5 {                      // название класса повторяется

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println(i);
    }
}

// тут была лишняя фигурная - это не логическая ошибка, а синтаксическая

