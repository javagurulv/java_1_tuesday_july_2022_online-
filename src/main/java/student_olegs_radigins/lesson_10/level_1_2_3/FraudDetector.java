package student_olegs_radigins.lesson_10.level_1_2_3;

class FraudDetector {
    String fraudName = "Pokemon";
    int maximumAmount = 1000000;
    String fraudCity = "Сидней";
    boolean isFraudName(Transaction t) {
        return t.getTrader().getFullName().equals(fraudName);
    }
    boolean isMoreThanMaximum(Transaction t){
        return t.getAmount() > maximumAmount;
    }
    boolean isFraudCity(Transaction t){
        return t.getTrader().getCity().equals(fraudCity);
    }
}
