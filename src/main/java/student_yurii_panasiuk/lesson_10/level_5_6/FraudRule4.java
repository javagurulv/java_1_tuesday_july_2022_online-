package student_yurii_panasiuk.lesson_10.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule4 extends FraudRule{

    String stateBlocked = "Ямайка";

    FraudRule4(String ruleName) {
        super(ruleName);
    }
    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getState().equals(stateBlocked);
    }

}