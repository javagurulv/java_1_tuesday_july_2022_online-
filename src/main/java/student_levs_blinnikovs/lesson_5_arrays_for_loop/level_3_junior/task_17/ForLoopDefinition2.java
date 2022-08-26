package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_3_junior.task_17;

// Найдите синтаксическую ошибку в программе и исправьте её:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopDefinition2 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {                   // тут не было разделителя после инициализации
            System.out.println(i);
        }
    }

}

