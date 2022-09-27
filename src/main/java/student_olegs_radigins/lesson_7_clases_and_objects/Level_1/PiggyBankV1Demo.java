package student_olegs_radigins.lesson_7_clases_and_objects.Level_1;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PiggyBankV1Demo {
    public static void main(String[] args) {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        System.out.println(piggyBankV1.getAmountOfMoneyInCents());
        piggyBankV1.addCoin(new Coin(1,"euro"));
        System.out.println(piggyBankV1.getAmountOfMoneyInCents());
        piggyBankV1.addCoin(new Coin(50,"cent"));
        System.out.println(piggyBankV1.getAmountOfMoneyInCents());
    }


}
