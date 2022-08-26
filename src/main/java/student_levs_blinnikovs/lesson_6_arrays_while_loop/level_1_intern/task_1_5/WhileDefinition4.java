package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_1_intern.task_1_5;
/*
Найдите логическую ошибку в программе и исправить её.
        Программа должна выводить числа от 1 до 100 на консоль.
 */

class WhileDefinition4 {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {                           // greater than (not gte)
            i++;                                    // indefinate loop, increment moved here
            System.out.println(i);
        }
    }

}
