package student_yurii_panasiuk.lesson_10.level_1_4.task_1_16;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Смотри src/main/java/teacher/lesson_10_single_responsibility_principle/codereview/CleanCodeWarning_2.txt")
class FraudDetector {

    String fraudTraderNick = "Pokemone";
    int maximumAmount = 1000000;
    String fraudCity = "Сидней";
    String stateBlocked = "Ямайка";

    boolean isFraudName(Transaction t) {
        return t.getTrader().getFullName().equals(fraudTraderNick);
    }

    boolean isMaximun(Transaction t) {
        return t.getAmount() > maximumAmount;
    }

    boolean isFraudCity(Transaction t) {
        return t.getTrader().getCity().equals(fraudCity);
    }

    boolean isFraudState(Transaction t) {
        return t.getTrader().getState().equals(stateBlocked);
    }

    boolean Rule5 (Transaction t) {
        Rule_5 stateAndAmmount = new Rule_5();
        return stateAndAmmount.getState().equals(t.getTrader().getState()) &&
                stateAndAmmount.getMaximumAmount() < t.getAmount();
    }

}
