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

    void shouldAddCents(int expectedCentsAdded, String centLabel) {
        PiggyBankV1 testPiggyBankV1 = createPiggyBankV1();
        testPiggyBankV1.addCoin(createCoin(expectedCentsAdded, centLabel));
        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV1.getAmountOfMoneyInCents()));
    }

    void shouldAddCents(int expectedCentsAdded, String centLabel, int coinCapacity) {
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(coinCapacity);
        testPiggyBankV2.addCoin(createCoin(expectedCentsAdded, centLabel));
        testResultPrinter(testComparator(expectedCentsAdded, testPiggyBankV2.getAmountOfMoneyInCents()));
    }

    void shouldAddEurAs100Cents(int eurAdded, String eurLabel) {
        PiggyBankV1 testPiggyBankV1 = createPiggyBankV1();
        testPiggyBankV1.addCoin(createCoin(eurAdded, eurLabel));
        testResultPrinter(testComparator((eurAdded * 100), testPiggyBankV1.getAmountOfMoneyInCents()));
    }

    void shouldAddEurAs100Cents(int eurAdded, String eurLabel, int coinCapacity) {
        PiggyBankV2 testPiggyBankV2 = createPiggyBankV2(coinCapacity);
        testPiggyBankV2.addCoin(createCoin(eurAdded, eurLabel));
        testResultPrinter(testComparator((eurAdded * 100), testPiggyBankV2.getAmountOfMoneyInCents()));
    }

    public static void main(String[] args) {

        PiggyBankTest test = new PiggyBankTest();
        test.shouldAddCents(1, "cent");
        test.shouldAddCents(2, "CENT");
        test.shouldAddCents(5, "cEnT");
        test.shouldAddCents(10, "cENt");
        test.shouldAddCents(20, "CeNt");
        test.shouldAddCents(50, "Cent");

        test.shouldAddEurAs100Cents(1, "EUR");
        test.shouldAddEurAs100Cents(2, "eur");

        System.out.println("PiggyBankV2 tests: ");
        test.shouldAddCents(1, "cent", 4);
        test.shouldAddCents(2, "CENT", 4);
        test.shouldAddCents(5, "cEnT", 4);
        test.shouldAddCents(10, "cENt", 4);
        test.shouldAddCents(20, "CeNt", 4);
        test.shouldAddCents(50, "Cent", 4);

        test.shouldAddEurAs100Cents(1, "EUR", 4);
        test.shouldAddEurAs100Cents(2, "eur", 4);

    }

}
