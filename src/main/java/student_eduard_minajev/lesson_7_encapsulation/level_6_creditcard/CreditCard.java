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

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class CreditCard {

    private long cardNumber;

    private int pinCode;

    private double accountBalance;

    private double creditLimit;

    private double creditDebt;

    CreditCard(long cardNumber, int pinCode, double accountBalance, double creditLimit, double creditDebt) {
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

    public void setAccountBalance(double newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }
    public void setCreditLimit (double newCreditLimit){
        this.creditLimit = newCreditLimit;
    }
    public void setCreditDebt (double newCreditDebt) {
        this.creditDebt = newCreditDebt;
    }

    // Создаем отдельный метод для проверки Пин-кода. Это должен быть Булеан. Если код совпадает - тру.
    public boolean checkPin () {
        System.out.println("Please enter your card's PIN code!");
        Scanner scanner = new Scanner(System.in);
        int userPin = scanner.nextInt();
        int cardPin = getPinCode();
        if (userPin == cardPin) { return true;
        } else {
            return false;
        }

    }
    // Отдельный метод для погашения задолжности по кредиту. Сумма автоматически должна вычитываться из суммы на депозите.
    public double payOffDebt (){
        getCreditDebt();
        setAccountBalance(accountBalance - getCreditDebt());
        return accountBalance;
    }
    // Отдельный метод для определения суммы взноса
    public double depositValue () {
        System.out.println("Please enter desired deposit value!");
        Scanner scanner = new Scanner(System.in);
        double depositSum = scanner.nextDouble();
        return depositSum;

    }
    // непосредственно сам метод взноса
    public double deposit (){
        if (checkPin() == true){
            double value = depositValue(); // убрать нельзя, иначе во время работы программа будет запрашивать сумму взноса два раза.
            double newDeposit = getAccountBalance() + value;
            setAccountBalance(newDeposit);
            payOffDebt(); // Загрузка метода погашения долга по кредиту. Если долга нет, будет вычтен 0.
            System.out.println("Your current Balance is " + getAccountBalance());
        } return accountBalance;

    }

    public void printBalanceToConsole (){
        System.out.println("Your account balance is: " + getAccountBalance() + " Your credit debit is: " + getCreditDebt());
    }

    public double applyCreditLimit (double newCreditLimit) {
        if (newCreditLimit > 0) {
            setCreditLimit(newCreditLimit);
        }
        return creditLimit;
    }

    public double withdrawValue () {
        System.out.println("Please enter desired withdraw value!");
        Scanner scanner = new Scanner(System.in);
        double withdrawValue = scanner.nextDouble();
        return withdrawValue;
    }

    public double withdraw () {
        if (checkPin() == true){
            double value = withdrawValue();
            double newDeposit = getAccountBalance() - value;
            if (newDeposit >= 0){
                setAccountBalance(newDeposit);
                return accountBalance;
            } else if (newDeposit >= getCreditLimit()) {
                setCreditDebt(newDeposit);
                return creditDebt;
            }else {
            System.out.println("Your account does not enough funds, and you have exceeded your credit limit.");
            }
        } return getAccountBalance();
    }

}
