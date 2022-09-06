package student_eduard_minajev.lesson_6_arrays_while_loop.level_1_intern;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Task5 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++; // ошибка в теле метода а так же не верные условия в сигнатуре
        }
    }

}
