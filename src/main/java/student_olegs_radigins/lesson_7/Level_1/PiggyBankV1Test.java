package student_olegs_radigins.lesson_7.Level_1;

class PiggyBankV1Test {

    public void testOneEur() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(1, "euro"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 100){
            System.out.println("Add 1 euro test OK");
        }else System.out.println("Add 1 euro test FAIL");
    }

    public void testTwoEur() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(2, "euro"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 200){
            System.out.println("Add 2 euro test OK");
        }else System.out.println("Add 2 euro test FAIL");
    }

    public void testOneCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(1, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 1){
            System.out.println("Add 1 cent test OK");
        }else System.out.println("Add 1 cent test FAIL");
    }
    public void testTwoCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(2, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 2){
            System.out.println("Add 2 cent test OK");
        }else System.out.println("Add 2 cent test FAIL");
    }

    public void testFiveCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(5, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 5){
            System.out.println("Add 5 cent test OK");
        }else System.out.println("Add 5 cent test FAIL");
    }

    public void testTenCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(10, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 10){
            System.out.println("Add 10 cent test OK");
        }else System.out.println("Add 10 cent test FAIL");
    }

    public void testTwentyCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(20, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 20){
            System.out.println("Add 20 cent test OK");
        }else System.out.println("Add 20 cent test FAIL");
    }

    public void testFiftyCent() {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(new Coin(50, "cent"));
        if (piggyBankV1.getAmountOfMoneyInCents() == 50){
            System.out.println("Add 50 cent test OK");
        }else System.out.println("Add 50 cent test FAIL");
    }

    public static void main(String[] args) {
        PiggyBankV1Test piggyBankV1Test = new PiggyBankV1Test();
        piggyBankV1Test.testOneEur();
        piggyBankV1Test.testTwoEur();
        piggyBankV1Test.testOneCent();
        piggyBankV1Test.testTwoCent();
        piggyBankV1Test.testFiveCent();
        piggyBankV1Test.testTenCent();
        piggyBankV1Test.testTwentyCent();
        piggyBankV1Test.testFiftyCent();
    }
}
