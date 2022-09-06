package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1;

class PiggyBankV1 {

    private int amountOfMoneyInCents;

    public PiggyBankV1() {
        this.amountOfMoneyInCents = 0;
    }

    public void addCoin(Coin coin) {
        if (coin.getTitle().equalsIgnoreCase("EUR")) {
            this.amountOfMoneyInCents += (coin.getDenomination() * 100);
        }
        if (coin.getTitle().equalsIgnoreCase("cent")) {
            this.amountOfMoneyInCents += coin.getDenomination();
        }
    }

    public int getAmountOfMoneyInCents() {
        return this.amountOfMoneyInCents;
    }

}
