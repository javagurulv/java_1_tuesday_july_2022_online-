package student_olegs_radigins.lesson_10.level_1_2_3_4;

class FraudDetector {
    String fraudName = "Pokemon";
    int maximumAmount = 1000000;
    String fraudCity = "Сидней";
    String fraudCountry = "Ямайка";
    String warningCountry = "Germany";
    int maxAmountForWarningContry = 1000;

    boolean isFraudName(Transaction t) {
        return t.getTrader().getFullName().equals(fraudName);
    }
    boolean isMoreThanMaximum(Transaction t){
        return t.getAmount() > maximumAmount;
    }
    boolean isFraudCity(Transaction t){
        return t.getTrader().getCity().equals(fraudCity);
    }
    boolean isFraudCountry(Transaction t){
        return t.getTrader().getCountry().equals(fraudCountry);
    }
    boolean isWarningCountry(Transaction t){
        return t.getTrader().getCountry().equals(warningCountry) && t.getAmount() > maxAmountForWarningContry;
    }
}
