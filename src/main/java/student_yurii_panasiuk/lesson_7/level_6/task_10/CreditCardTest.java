package student_yurii_panasiuk.lesson_7.level_6.task_10;

import java.util.Objects;

public class CreditCardTest {

    public static void main(String[] args) {


        CreditCardTest();

    }

        static void CreditCardTest () {
            CreditCard newCard = new CreditCard(1111, 1234);
            newCard.setCreditLimit(10);

            System.out.print("Card Number Test Is ");
            testResult (newCard.getCardNumber() == 1111);

            System.out.print("Card PinCode Test Is ");
            testResult (newCard.getPinCode() == 1234);

            System.out.print("Card Deposite Test Is ");
            double moneyAmountBeforeDeposite = newCard.getBalance();
            newCard.depositeWithPinCode(1234, 10);
            double moneyAmountAfterDeposite = newCard.getBalance();
            testResult (newCard.getBalance() == 10 &&
                    (moneyAmountAfterDeposite - moneyAmountBeforeDeposite) == 10);

            System.out.print("Card Withdraw Test Is ");
            double moneyAmountBeforeWithdraw = newCard.getBalance();
            newCard.withdrawWithPinCode(1234, 10);
            double moneyAmountAfterWithdraw = newCard.getBalance();
            testResult (newCard.getBalance() == 0 &&
                    (moneyAmountBeforeWithdraw - moneyAmountAfterWithdraw) == 10);

            System.out.print("Card CreditLimit Test Is ");
            testResult(newCard.getCreditLimit() == 10 && newCard.getBalance() == 0 &&
                                newCard.getLoanDebt() == 0);

            }


    static void testResult(boolean check) {
        if (check) {
            System.out.println(" OK");
        } else {
            System.out.println(" FAIL");
        }
    }
}




