package student_yurii_panasiuk.lesson_10.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule2 extends FraudRule {

    int maximumAmount = 1000000;

    FraudRule2(String ruleName) {
        super(ruleName);
    }

    @Override
    boolean isFraud(Transaction t) {
        return t.getAmount() > maximumAmount;
    }

}
