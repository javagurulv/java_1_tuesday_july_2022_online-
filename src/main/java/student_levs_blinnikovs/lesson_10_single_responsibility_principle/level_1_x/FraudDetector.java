package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

}
