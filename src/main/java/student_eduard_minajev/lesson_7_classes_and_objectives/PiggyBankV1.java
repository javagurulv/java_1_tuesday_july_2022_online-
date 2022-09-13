package student_eduard_minajev.lesson_7_classes_and_objectives;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PiggyBankV1 {


    private int amountOfMoneyInCents;


    public PiggyBankV1() {
        this.amountOfMoneyInCents = 0;
    }

    public void addCoin(Coin coin) {
        if (coin.getTitle().equals("Euro")){
            this.amountOfMoneyInCents += (coin.getDenomination() * 100);
        } else if (coin.getTitle().equals("Cent")) {
            this.amountOfMoneyInCents += (coin.getDenomination());
        }
    }

    public int getAmountOfMoneyInCents() {
        return this.amountOfMoneyInCents;
    }


}
