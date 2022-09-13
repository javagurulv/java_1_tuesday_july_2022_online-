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

    private String cardNumber;

    private String pinCode;

    private int accountBalance;

    private int creditLimit;

    private int creditDebt;

    CreditCard(String cardNumber, String pinCode, int creditLimit) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.accountBalance = 0;
        this.creditLimit = creditLimit;
        this.creditDebt = 0;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int getCreditDebt() {
        return creditDebt;
    }

    public void setAccountBalance(int newAccountBalance) {
        this.accountBalance = newAccountBalance;
    }
    public void setCreditLimit (int newCreditLimit){
        this.creditLimit = newCreditLimit;
    }
    public void setCreditDebt (int newCreditDebt) {
        this.creditDebt = newCreditDebt;
    }

    // Отдельный методу сканера, который закидывает данные ввода в метод сравнения пин-кода
    public String enterPinCode () {
        System.out.println("Please enter your card's PIN code!");
        Scanner scanner = new Scanner(System.in);
        String enteredPinCode = scanner.next();
        return enteredPinCode;
    }
    // Отдельный метод сравнения пин-кода, который получает исходные данные от метода enterPinCode
    public boolean comparePinCodes (String pinCode) {
        String pinFromUser = pinCode;
        String cardPin = getPinCode();
        if (pinFromUser == cardPin) { return true;
        } else {
            return false;
        }

    }
    // Отдельный метод для погашения задолжности по кредиту. Сумма автоматически должна вычитываться из суммы на депозите.
    // По условию должен быть интегрирован в метод депозит.
    public int payOffDebt (){
        getCreditDebt();
        setAccountBalance(accountBalance - getCreditDebt());
        return accountBalance;
    }
    // Отдельный метод для определения суммы взноса
    public int depositValue () {
        int valueEuro = valueOfEuros();
        int valueCents = valueOfCents();
        setAccountBalance(valueEuro + valueCents);
        return accountBalance;
    }

    public int valueOfEuros () {
        System.out.println("Please enter amount of Euro");
        Scanner scanner = new Scanner(System.in);
        int depositSum = scanner.nextInt();
        if (depositSum > 0) {
        } return depositSum * 100;
    }

    public int valueOfCents () {
        System.out.println("Please enter amount of cents");
        Scanner scanner = new Scanner(System.in);
        int depositSum = scanner.nextInt();
        if (depositSum > 0) {
        } return depositSum;
    }


    // непосредственно сам метод взноса
    public int deposit (int depositSum){
        if (comparePinCodes(enterPinCode()) == true){
            int newDeposit = getAccountBalance() + depositSum;
            setAccountBalance(newDeposit);
            payOffDebt(); // Загрузка метода погашения долга по кредиту. Если долга нет, будет вычтен 0.
            System.out.println("Your current Balance is " + getAccountBalance());
        } return accountBalance;

    }

    public double prepareBalanceForDisplay () {
        double actualBalance = getAccountBalance()/100;
        return actualBalance;
    }

    public double prepareCreditDebtForDisplay () {
        double actualCreditDebt = getCreditDebt()/100;
        return actualCreditDebt;
    }

    public void printBalanceToConsole (){
        System.out.println("Your account balance is: " + prepareBalanceForDisplay() + " Your credit debt is: " + prepareCreditDebtForDisplay());
    }

    public int introduceCreditDebt (int newCreditDebt) {
        if (newCreditDebt > 0){
            setCreditDebt(newCreditDebt);
        }return creditDebt;
    }

    public int applyCreditLimit (int newCreditLimit) {
        if (newCreditLimit > 0) {
            setCreditLimit(newCreditLimit);
        }
        return creditLimit;
    }

    public int withdrawValue () {
        System.out.println("Please enter desired withdraw value!");
        Scanner scanner = new Scanner(System.in);
        int withdrawValue = scanner.nextInt();
        return withdrawValue;
    }

    public int calculateRequiredDebt (int newDeposit){
        int requiredDebt = 0;
        while ((newDeposit - requiredDebt) > 0 ){
            requiredDebt++;
        }
        return requiredDebt;
    }

    public int withdraw (int withdrawValue) {
        if (comparePinCodes(enterPinCode()) == true){
            int newDeposit = getAccountBalance() - withdrawValue;
            if (newDeposit >= 0){
                setAccountBalance(getAccountBalance() - withdrawValue);
                return accountBalance;
            } else if (newDeposit <= getCreditLimit()) {
                setCreditDebt(calculateRequiredDebt(newDeposit));
            }else {
            System.out.println("Your account does not enough funds, and you have exceeded your credit limit.");
            }
        } return getAccountBalance();
    }

}
