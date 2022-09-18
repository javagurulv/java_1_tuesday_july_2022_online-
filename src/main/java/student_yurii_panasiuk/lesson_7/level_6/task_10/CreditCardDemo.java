package student_yurii_panasiuk.lesson_7.level_6.task_10;

public class CreditCardDemo {

    public static void main(String[] args) {

        CreditCard newCard = new CreditCard(1111, 1234);

        System.out.println(newCard.getCardNumber() + "\n" + newCard.getPinCode() + "\n" + newCard.getBalance() + "\n"
                + newCard.getLoanDebt() + "\n" + newCard.getCreditLimit() + "\n" );

        newCard.depositeWithPinCode(1234, 5);

        System.out.println(newCard.getCardNumber() + "\n" + newCard.getPinCode() + "\n" + newCard.getBalance() + "\n"
                + newCard.getLoanDebt() + "\n" + newCard.getCreditLimit() + "\n" );

        newCard.withdrawWithPinCode(1234, 15);

        System.out.println(newCard.getCardNumber() + "\n" + newCard.getPinCode() + "\n" + newCard.getBalance() + "\n"
                + newCard.getLoanDebt() + "\n" + newCard.getCreditLimit() + "\n" );

        newCard.withdrawWithPinCode(1234, 15);

        System.out.println(newCard.getCardNumber() + "\n" + newCard.getPinCode() + "\n" + newCard.getBalance() + "\n"
                + newCard.getLoanDebt() + "\n" + newCard.getCreditLimit() + "\n" );


    }

}
