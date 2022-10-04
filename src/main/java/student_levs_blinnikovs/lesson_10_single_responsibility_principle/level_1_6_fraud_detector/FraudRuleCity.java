package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_6_fraud_detector;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRuleCity extends FraudRule {

    public FraudRuleCity(String ruleName) {
        super(ruleName);
    }

    @Override
    public boolean isFraud(Transaction transaction) {
        return transaction.getTrader().getCity().equals("Sydney");
    }

}
