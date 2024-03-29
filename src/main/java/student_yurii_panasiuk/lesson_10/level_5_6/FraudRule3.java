package student_yurii_panasiuk.lesson_10.level_5_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FraudRule3 extends FraudRule {

    String fraudCity = "Сидней";

    FraudRule3(String ruleName) {
        super(ruleName);
    }
    @Override
    boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals(fraudCity);
    }

}