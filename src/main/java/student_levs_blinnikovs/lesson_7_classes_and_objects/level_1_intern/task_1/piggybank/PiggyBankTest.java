package student_levs_blinnikovs.lesson_7_classes_and_objects.level_1_intern.task_1.piggybank;

class PiggyBankTest {

    /*
    Протестируйте добавление
    в копилку монет разного номинала: 1,2,5,10,20,50 центов и 1,2 евро.
     */

    PiggyBankV1 createPiggyBankV1() {
        return new PiggyBankV1();
    }
    PiggyBankV2 createPiggyBankV2(int coinCapacity) {
        return new PiggyBankV2(coinCapacity);
    }

    Coin createCoin(int denomination, String title) {
        return new Coin(denomination, title);
    }

    boolean testComparator(int expectedCentsAdded, int realAmountOfMoneyInCents) {
        return expectedCentsAdded == realAmountOfMoneyInCents;
    }

    void testResultPrinter(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }

    void addSingleCoinSmokeTest(int expectedCentsAdded, String centLabel) {
        PiggyBankV1 testPiggyBankV1 = createPiggyBankV1();
        testPiggyBankV1.addCoin(createCoin(expectedCentsAdded, centLabel));
        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV1.getAmountOfMoneyInCents()));
    }

    void addSingleCoinSmokeTestV2(int expectedCentsAdded, String centLabel) { // removed overloading for single coin tests
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(1);
        testPiggyBankV2.addCoin(createCoin(expectedCentsAdded, centLabel));  // somehow would be better to pass object of PiggyBank superclass to the method
        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV2.getAmountOfMoneyInCents()));
    }

    void addSingleEurCoinSmokeTest(int eurAdded, String eurLabel) {
        PiggyBankV1 testPiggyBankV1 = createPiggyBankV1();
        testPiggyBankV1.addCoin(createCoin(eurAdded, eurLabel));
        testResultPrinter(testComparator((eurAdded * 100), testPiggyBankV1.getAmountOfMoneyInCents()));
    }

    void addSingleEurCoinSmokeTestV2(int eurAdded, String eurLabel) {
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(1);
        testPiggyBankV2.addCoin(createCoin(eurAdded, eurLabel));
        testResultPrinter(testComparator((eurAdded * 100), testPiggyBankV2.getAmountOfMoneyInCents()));
    }

    void addMultipleCoinsSmokeTest() {
        PiggyBankV1 testPiggyBankV1 = createPiggyBankV1();

        Coin coin1Cent = createCoin(1, "cent");
        Coin coin2Cent = createCoin(2, "cent");
        Coin coin5Cent = createCoin(5, "cent");
        Coin coin10Cent = createCoin(10, "cent");
        Coin coin20Cent = createCoin(20, "cent");
        Coin coin50Cent = createCoin(50, "cent");
        Coin coin1Eur = createCoin(1, "EUR");
        Coin coin2Eur = createCoin(2, "EUR");

        testPiggyBankV1.addCoin(coin2Eur);
        testPiggyBankV1.addCoin(coin1Eur);
        testPiggyBankV1.addCoin(coin50Cent);
        testPiggyBankV1.addCoin(coin20Cent);
        testPiggyBankV1.addCoin(coin10Cent);
        testPiggyBankV1.addCoin(coin5Cent);
        testPiggyBankV1.addCoin(coin2Cent);
        testPiggyBankV1.addCoin(coin1Cent);   // 3.88 EUR (388 cents)

        int expectedCentsAdded = 388;

        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV1.getAmountOfMoneyInCents()));
    }

    void addMultipleCoinsSmokeTestV2() {
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(8);

        Coin coin1Cent = createCoin(1, "cent");
        Coin coin2Cent = createCoin(2, "cent");
        Coin coin5Cent = createCoin(5, "cent");
        Coin coin10Cent = createCoin(10, "cent");
        Coin coin20Cent = createCoin(20, "cent");
        Coin coin50Cent = createCoin(50, "cent");
        Coin coin1Eur = createCoin(1, "EUR");
        Coin coin2Eur = createCoin(2, "EUR");

        testPiggyBankV2.addCoin(coin2Eur);
        testPiggyBankV2.addCoin(coin1Eur);
        testPiggyBankV2.addCoin(coin50Cent);
        testPiggyBankV2.addCoin(coin20Cent);
        testPiggyBankV2.addCoin(coin10Cent);
        testPiggyBankV2.addCoin(coin5Cent);
        testPiggyBankV2.addCoin(coin2Cent);
        testPiggyBankV2.addCoin(coin1Cent);   // 3.88 EUR (388 cents)

        int expectedCentsAdded = 388;

        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV2.getAmountOfMoneyInCents()));
    }

    void cantAddDueToFullTest() {
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(3);
        // TODO hide in Coin[] wallet and reuse indexes maybe
//        Coin coin1Cent = createCoin(1, "cent");
//        Coin coin2Cent = createCoin(2, "cent");
//        Coin coin5Cent = createCoin(5, "cent");
//        Coin coin10Cent = createCoin(10, "cent");

        Coin coin20Cent = createCoin(20, "cent");
        Coin coin50Cent = createCoin(50, "cent");
        Coin coin1Eur = createCoin(1, "EUR");
        Coin coin2Eur = createCoin(2, "EUR");

        testPiggyBankV2.addCoin(coin2Eur);
        testPiggyBankV2.addCoin(coin1Eur);
        testPiggyBankV2.addCoin(coin50Cent);
        testPiggyBankV2.addCoin(coin20Cent);

        int expectedCentsAdded = 350;

        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV2.getAmountOfMoneyInCents()));
    }



    public static void main(String[] args) {

        PiggyBankTest test = new PiggyBankTest();

        System.out.println("PiggyBankV1 smoke tests:");
        test.addSingleCoinSmokeTest(1, "cent");
        test.addSingleCoinSmokeTest(2, "CENT");
        test.addSingleCoinSmokeTest(5, "cEnT");
        test.addSingleCoinSmokeTest(10, "cENt");
        test.addSingleCoinSmokeTest(20, "CeNt");
        test.addSingleCoinSmokeTest(50, "Cent");

        test.addSingleEurCoinSmokeTest(1, "EUR");
        test.addSingleEurCoinSmokeTest(2, "eur");

        System.out.println("\nPiggyBankV1 multiple coin addition tests:");
        test.addMultipleCoinsSmokeTest();


        System.out.println("\nPiggyBankV2 smoke tests: ");
        test.addSingleCoinSmokeTestV2(1, "cent");
        test.addSingleCoinSmokeTestV2(2, "CENT");
        test.addSingleCoinSmokeTestV2(5, "cEnT");
        test.addSingleCoinSmokeTestV2(10, "cENt");
        test.addSingleCoinSmokeTestV2(20, "CeNt");
        test.addSingleCoinSmokeTestV2(50, "Cent");

        test.addSingleEurCoinSmokeTestV2(1, "EUR");
        test.addSingleEurCoinSmokeTestV2(2, "eur");

        System.out.println("\nPiggyBankV2 multiple coin addition tests:");
        test.addMultipleCoinsSmokeTestV2();

        System.out.println("\nPiggyBankV2 additional functionality tests: ");
        System.out.println("\nSlot is empty unit test: ");
        // TODO slot empty unit test

        System.out.println("\nSlot is NOT empty unit test: ");
        // TODO slot not empty unit test

        System.out.println("\nPiggy bank is full unit tests: ");
        // TODO piggy bank full unit test

        System.out.println("\nPiggy bank is NOT full unit tests: ");
        // TODO piggy bank full unit test

        System.out.println("\nPiggy bank is full (nothing new adds) tests: ");
        test.cantAddDueToFullTest(); // when not full - covered by smoke tests

        System.out.println("\nPiggy bank is empty (no new calculations run) tests: ");
        // TODO validate that no calculations run on empty cells

    }

}
