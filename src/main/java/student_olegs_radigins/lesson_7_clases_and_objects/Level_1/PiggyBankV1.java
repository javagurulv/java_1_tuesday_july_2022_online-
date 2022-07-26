package student_olegs_radigins.lesson_7_clases_and_objects.Level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PiggyBankV1 {
    private int amountOfMoneyInCents;

    public PiggyBankV1() {
        this.amountOfMoneyInCents = 0;
    }

    public void addCoin(Coin coin) {
        if (coin.getTitle().equalsIgnoreCase("euro")) {
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
