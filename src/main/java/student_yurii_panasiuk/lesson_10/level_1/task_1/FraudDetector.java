package student_yurii_panasiuk.lesson_10.level_1.task_1;

class FraudDetector {

    String fraudTraderNick = "Pokemone";
    int maximumAmount = 1000000;

    boolean isFraud(Transaction t) {
        if (t.getTrader().getFullName().equals(fraudTraderNick)) {
            return true;
        } else {
            return false;
        }
    }


    boolean isMaximun(Transaction t) {
        if (t.getTrader().getAmount() = maximumAmount) {
            return true;
        } else {
            return false;
        }
    }

}
