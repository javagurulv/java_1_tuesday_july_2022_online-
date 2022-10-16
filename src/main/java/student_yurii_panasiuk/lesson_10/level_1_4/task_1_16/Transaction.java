package student_yurii_panasiuk.lesson_10.level_1_4.task_1_16;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Transaction {

    private Trader trader;
    private int amount;

    Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() {
        return trader;
    }

    int getAmount() {
        return amount;
    }
}
