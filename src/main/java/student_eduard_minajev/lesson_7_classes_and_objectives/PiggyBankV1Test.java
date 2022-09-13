package student_eduard_minajev.lesson_7_classes_and_objectives;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PiggyBankV1Test {

    public static void main(String[] args) {
        PiggyBankV1Test test = new PiggyBankV1Test();
        test.shouldAdd20Cents();
        test.shouldAdd1Euro();
        test.shouldAdd3Euro();
        test.shouldAdd4Euro50Cents();
    }

    private void checkTestResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

    Coin coin20Cents = new Coin(20, "Cent");
    Coin coin1Euro = new Coin(1,"Euro");

    Coin coin2Euro = new Coin(2, "Euro");

    Coin coin50Cents = new Coin(50,"Cent");

    public void shouldAdd20Cents (){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(coin20Cents);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 20, "shouldAdd20Cents");

    }

    public void shouldAdd1Euro (){
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(coin1Euro);
        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 100, "shouldAdd1Euro");

    }

    public void shouldAdd3Euro () {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(coin2Euro);
        piggyBankV1.addCoin(coin1Euro);

        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 300, "shouldAdd3Euro");
    }

    public void shouldAdd4Euro50Cents () {
        PiggyBankV1 piggyBankV1 = new PiggyBankV1();
        piggyBankV1.addCoin(coin2Euro);
        piggyBankV1.addCoin(coin2Euro);
        piggyBankV1.addCoin(coin50Cents);

        int moneyAmount = piggyBankV1.getAmountOfMoneyInCents();
        checkTestResult(moneyAmount == 450, "shouldAdd4Euro50Cents");
    }


}
