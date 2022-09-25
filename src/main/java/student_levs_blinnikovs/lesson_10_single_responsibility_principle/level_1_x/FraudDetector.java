package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class FraudDetector {

    FraudRule[] fraudRules;

    public FraudDetector(FraudRule[] fraudRules) {
        this.fraudRules = fraudRules;
    }

    FraudDetectionResult isFraud(Transaction transaction) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(transaction)) {
                System.out.println("Fraudulent transaction: " + transaction);
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }

}
