package student_levs_blinnikovs.lesson_7_encapsulation.level_5_middle.task_9;

class PowerCalculator {

    int power(int base, int power) {
        int result = base;
        for (int i = 1; i < power; i++) {
            result *= base;
        }
        return result;
    }

}
