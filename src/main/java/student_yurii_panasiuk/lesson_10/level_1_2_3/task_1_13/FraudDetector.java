package student_yurii_panasiuk.lesson_10.level_1_2_3.task_1_13;

class FraudDetector {

    String fraudTraderNick = "Pokemone";
    int maximumAmount = 1000000;
    String fraudCity = "Сидней";
    String stateBlocked = "Ямайка";

    boolean isFraudName(Transaction t) {
        if (t.getTrader().getFullName().equals(fraudTraderNick)) {
            return true;
        } else {
            return false;
        }
    }

    boolean isMaximun(Transaction t) {
        if (t.getAmount() > maximumAmount) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudCity(Transaction t) {
        if (t.getTrader().getCity().equals(fraudCity)) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFraudState(Transaction t) {
        if (t.getTrader().getState().equals(stateBlocked)) {
            return true;
        } else {
            return false;
        }
    }

    boolean Rule5 (Transaction t) {
        Rule_5 stateAndAmmount = new Rule_5();
        return stateAndAmmount.getState().equals(t.getTrader().getState()) &&
                stateAndAmmount.getMaximumAmount() < t.getAmount();
    }

}
