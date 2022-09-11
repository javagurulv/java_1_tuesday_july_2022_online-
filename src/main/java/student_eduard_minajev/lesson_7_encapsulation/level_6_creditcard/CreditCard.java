/* Необходимо разработать класс "кредитная карта" CreditCard
с учетом инкапсуляции, который обладает следующими характеристиками:

Свойства
-Номер карты
-Пин-код карты
-Баланс
-Кредитный лимит
-Задолженность по кредиту


Методы

-Зачисление средств на карту ("deposit")
-Снятие средств с карты ("withdraw")

При создании карты нужно указывать ее номер и пин код.
Начальный баланс и задолженность по кредиту равны 0.
Кредитный лимит можно менять после создания карты.

Требования к снятию средств:
- При снятии средств с карты необходимо указывать пин-код и желаемую сумму;
- Если пин-коды не совпадают, операция по снятию денег должна быть отклонена;
- Деньги снимаются с карточного баланса. В случае, если их не хватает, остаток суммы нужно брать за счет задолженности по кредиту;
- Если сумма задолженности превышает кредитный лимит, операция по снятию денег должна быть отклонена;

Требования к зачислению средств:
- При зачислении средств на карту необходимо указывать пин-код и желаемую сумму;
- Если пин-коды не совпадают, операция по зачислению денег должна быть отклонена;
- В первую очередь зачисление покрывает задолженность по кредиту;
- Если задолженность по кредиту равна 0, то остаток средств зачисляется в счет баланса;

Написать тестовые сценарии для класса CreditCard в классе CreditCardTest.
Все тестовые сценарии должны отрабатывать без ошибок. */

package student_eduard_minajev.lesson_7_encapsulation.level_6_creditcard;


import java.util.Scanner;

public class CreditCard {

     private long cardNumber;

    private int pinCode;

    private double accountBalance;

    private double creditLimit;

    private double creditDebt;

    CreditCard (long cardNumber, int pinCode, double accountBalance, double creditLimit, double creditDebt){
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.accountBalance = accountBalance;
        this.creditLimit = creditLimit;
        this.creditDebt = creditDebt;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public int getPinCode() {
        return pinCode;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getCreditDebt() {
        return creditDebt;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public double deposit (double depositSum){
        System.out.println("Please enter your card's PIN code!");
        Scanner scanner = new Scanner(System.in);
        int userPin = scanner.nextInt();
        getPinCode();
        if (userPin == getPinCode()){
            System.out.println("Please enter desired amount of money to be put on a deposit!");
            double newDeposit = scanner.nextDouble();
            setAccountBalance(newDeposit);
        } return accountBalance;
    }
}
