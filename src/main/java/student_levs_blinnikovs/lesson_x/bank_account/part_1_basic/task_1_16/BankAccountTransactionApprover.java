package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

/*
Решаем задачу: можно ли разрешить выполнить новую транзакцию?

Вам поручили реализовать алгоритм, который будет принимать решение
можно ли одобрить новую транзакцию или нет. На данный момент правила
просты - транзакцию можно одобрить только если на балансе у пользователя
есть достаточно средств. В минус уходить нельзя :).

Для выполнения этого расчёта создайте новый класс BankAccountTransactionApprover.

class BankAccountTransactionApprover {

    // для подтверждения или отклонения новой транзакции вам потребуется
    // узнать текущий баланс банковского аккаунта, алгоритм расчёта
    // текущего баланса реализован в классе BankAccountCurrentBalanceCalculator,
    // что бы не копировать этот алгоритм в класс BankAccountTransactionApprover
    // воспользуемся алгоритмом из класса BankAccountCurrentBalanceCalculator
    // для этого создаём следующее свойство
    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    // создайте конструктор класса у которого будет один параметр BankAccountCurrentBalanceCalculator
    // сохраните полученную ссылку в свойство currentBalanceCalculator созданное ранее

}
 */

class BankAccountTransactionApprover {

    private BankAccountCurrentBalanceCalculator currentBalanceCalculator;

    BankAccountTransactionApprover(BankAccountCurrentBalanceCalculator currentBalanceCalculator) {
        this.currentBalanceCalculator = currentBalanceCalculator;
    }

    public boolean isApproved(BankAccount bankAccount, Transaction transactionToApprove) {
        // setting false by default for error cases
        boolean isApproved = false;
        int currentBalance = currentBalanceCalculator.calculate(bankAccount);

        // for DEPOSIT no limits, only WITHDRAWAl
        if (transactionToApprove.isDeposit()) {
            System.out.println("This is deposit transaction. No limitations. OK.");
            isApproved = true;
        } else if (transactionToApprove.isWithdrawal()) {
            // if isWithdrawal, start logic check
            if (currentBalance >= transactionToApprove.getAmount()) {
                System.out.println("Bank account balance allows withdrawing transaction. OK.");
                isApproved = true;
            } else if (currentBalance < transactionToApprove.getAmount()) {
                System.out.println("Bank account balance doesn't allow withdrawing transaction. Not OK.");
                // remains false from default case
            } else {
                System.out.println("Error has occurred. Please try again.");
            }
        }
        return isApproved;
    }


}