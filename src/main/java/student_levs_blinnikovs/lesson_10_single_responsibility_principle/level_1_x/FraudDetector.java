package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudDetector {

    boolean isFraud(Transaction transaction) {
        return isFraudulentName(transaction) ||
                isFraudulentAmount(transaction) ||
                isFraudulentCity(transaction) ||
                isFraudulentCountry(transaction) ||
                isFraudulentCountryAndAmountCombination(transaction);
    }

    private boolean isFraudulentName(Transaction transaction) {
        return transaction.getTrader().getFullName().equals("Pokemon");
    }

    private boolean isFraudulentAmount(Transaction transaction) {
        return isTransactionHigherThan(transaction, 1000000);
    }

    private boolean isFraudulentCity(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

    private boolean isFraudulentCountry(Transaction transaction) {
        return isTransactionFromCountry(transaction, "Jamaica");
    }

    private boolean isFraudulentCountryAndAmountCombination(Transaction transaction) {
        return isTransactionFromCountry(transaction, "Germany") &&
                isTransactionHigherThan(transaction, 1000);
    }

    private boolean isTransactionFromCountry(Transaction transaction, String country) {
        return transaction.getTrader().getCountry().equals(country);
    }

    private boolean isTransactionHigherThan(Transaction transaction, int amount) {
        return transaction.getAmount() > amount;
    }

}
