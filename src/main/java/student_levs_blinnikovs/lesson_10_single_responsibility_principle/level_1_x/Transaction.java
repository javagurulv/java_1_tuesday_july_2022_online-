package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_1_x;

class Transaction {

    private Trader trader;
    private int amount;

    public Transaction(Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }

    public Trader getTrader() {
        return trader;
    }

    public int getAmount() {
        return amount;
    }
}


