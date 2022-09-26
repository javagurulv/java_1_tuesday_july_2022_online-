package student_levs_blinnikovs.lesson_7_encapsulation.level_5_middle.task_9;

class PowerCalculator {

    public double power(double base, int power) {
        if (power == 0) {
            return 1.0D;
        }
        if (power < 0) {
            return 1 / powerPositive(base, -power);                 // negative value of power in this if, so it would use positive value of power
        } else {
            return powerPositive(base, power);
        }
    }

    private double powerPositive(double base, int power) {
        double result = base;
        for (int i = 1; i < power; i++) {                          // also could be used ABS(power) for negative cases.
            result *= base;
        }
        return result;
    }

}
