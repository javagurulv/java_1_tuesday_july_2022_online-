package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_3_junior.task_18;

//Найдите синтаксическую ошибку в программе и исправьте её:

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ForLoopDefinition3 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {  // не было разделителя перед инкрементом
            System.out.println(i);
        }
    }

}

