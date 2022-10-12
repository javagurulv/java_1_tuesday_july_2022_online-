package student_ernest_aleskevics.lesson_10.level_1;

public class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public Trader getTrader() {
        return trader;
    }
}
