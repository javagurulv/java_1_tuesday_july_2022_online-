package student_yurii_panasiuk.lesson_10.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

     abstract boolean isFraud(Transaction t);

    String getRuleName() {
        return ruleName;
    }

}