package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_1_intern.task_1_5;

//Найдите ошибку в программе и исправить её:

class WhileDefinition1 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {  // не было открывающей скобки
            System.out.println(i);
            i++;
        }
    }

}

