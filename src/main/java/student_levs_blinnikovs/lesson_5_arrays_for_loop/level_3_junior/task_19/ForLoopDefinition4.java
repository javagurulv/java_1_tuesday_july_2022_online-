package student_levs_blinnikovs.lesson_5_arrays_for_loop.level_3_junior.task_19;

// Найдите логическую ошибку в программе и исправьте её:

class ForLoopDefinition4 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {              // из-за того что проверка на то что i меньше 10, условие выполняется всегда и входит в бесконечный цикл. Поправили условие
            System.out.println(i);
        }
    }

}

// PS: программа должна выводить на консоль числа от 0 до 9.
