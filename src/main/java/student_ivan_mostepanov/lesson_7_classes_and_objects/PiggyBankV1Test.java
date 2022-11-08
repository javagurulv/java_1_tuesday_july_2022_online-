package student_ivan_mostepanov.lesson_7_classes_and_objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class PiggyBankV1Test {

    public static void main(String[] args) {
        PiggyBankV1Test test = new PiggyBankV1Test();
        test.add1Euro();
        test.add2Euro();
        test.add1Cent();
        test.add2Cent();
        test.add5Cent();
        test.add10Cent();
        test.add20Cent();
        test.add50Cent();
    }


    private void checkTestResult(boolean condition,String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    Coin euro1Coin = new Coin(1,"Euro");
    Coin euro2Coin = new Coin(2,"Euro");
    Coin cent1Coin = new Coin(1,"Cent");
    Coin cent2Coin = new Coin(2,"Cent");
    Coin cent5Coin = new Coin(5,"Cent");
    Coin cent10Coin = new Coin(10,"Cent");
    Coin cent20Coin = new Coin(20,"Cent");
    Coin cent50Coin = new Coin(50,"Cent");

    public void add1Euro(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(euro1Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 100,"One Euro");
    }
    public void add2Euro(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(euro2Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 200,"Two Euro");
    }
    public void add1Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent1Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 1,"One Cent");

    }
    public void add2Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent2Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 2,"Two Cent");

    }
    public void add5Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent5Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 5,"Five Cent");

    }
    public void add10Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent10Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 10,"Ten Cent");

    }
    public void add20Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent20Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 20,"Twenty Cent");

    }
    public void add50Cent(){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(cent50Coin);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 50,"Fifty Cent");

    }

}
