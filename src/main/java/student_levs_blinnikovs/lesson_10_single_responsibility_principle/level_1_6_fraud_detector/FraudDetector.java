package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
