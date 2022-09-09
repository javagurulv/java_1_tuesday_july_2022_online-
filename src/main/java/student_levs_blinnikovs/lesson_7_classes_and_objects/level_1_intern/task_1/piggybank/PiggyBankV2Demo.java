package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.piggybank;

class PiggyBankV2Demo {

    public static void main(String[] args) {

        PiggyBankV2 testPiggyBankV2 = new PiggyBankV2(4);

        Coin coin1Cent = new Coin(1, "cent");
        Coin coin2Cents = new Coin(2, "cent");
        Coin coin5Cents = new Coin(5, "cent");
        Coin coin10Cents = new Coin(10, "cent");
        Coin coin20Cents = new Coin(20, "cent");
        Coin coin50Cents = new Coin(50, "cent");

        Coin coin1Eur = new Coin(1, "EUR");
        Coin coin2Eur = new Coin(2, "EUR");

        testPiggyBankV2.addCoin(coin10Cents);
        testPiggyBankV2.addCoin(coin10Cents);
        testPiggyBankV2.addCoin(coin10Cents);
        testPiggyBankV2.addCoin(coin2Eur); // expect 230. New coins are not added.

        testPiggyBankV2.addCoin(coin1Eur); // ignored - OK


        int result = testPiggyBankV2.getAmountOfMoneyInCents();
        System.out.println(result);

    }
}
