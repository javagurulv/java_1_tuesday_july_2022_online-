package student_olegs_radigins.lesson_10.level_1_2;

class FraudDetector {
    String fraudName = "Pokemon";
    boolean isFraudName(Transaction t) {
        return t.getTrader().getFullName().equals(fraudName);
    }
}
