package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_4_junior.task_19;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 1; i >= 0; i++) {
            System.out.println("Роковая ошибка номер " + i);
            if (i == 666) {
                System.out.println("Это ваше счастливое число...");
                break;
            }
        }
    }
}
