package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
abstract class FraudRule {
    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
