package student_levs_blinnikovs.lesson_6_arrays_while_loop.level_4_junior.task_20;

class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("Shhh... 4 is not a lucky number... don't need that.");
                continue;
            }
            System.out.println(i);
        }
    }
}
