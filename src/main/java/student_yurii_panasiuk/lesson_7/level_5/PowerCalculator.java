package student_yurii_panasiuk.lesson_7.level_5;

class PowerCalculator {

    double exponentiation(double number, double power) {
        double result = 1.0;
        for (int i = 0; i < power; i++) {
            result = result * number;
        }
        return result;
    }
    boolean verificationPower(double power) {
        return power % 1 != 0;
    }
    void verificationFailedMessage () {
            System.out.println("power must be an integer greater than 0");
    }
}





