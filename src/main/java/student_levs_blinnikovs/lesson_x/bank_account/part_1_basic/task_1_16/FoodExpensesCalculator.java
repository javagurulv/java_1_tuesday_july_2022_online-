package student_levs_blinnikovs.lesson_x.bank_account.part_1_basic.task_1_16;

/*
        Давайте составим (придумаем/распишем) на словах алгоритм решения этой задачи:
        1. Берём все транзакции банковского аккаунта;
        2. Отбираем только WITHDRAWAL транзакции, так как они являются расходами;
        3. Из WITHDRAWAL транзакций отбираем транзакции у которых в категории расходов указано FOOD;
        4. Проходим по всем отобранным транзакциям и суммируем потраченные деньги.

 */

import java.util.ArrayList;

class FoodExpensesCalculator {

    ArrayList<Transaction> getWithdrawalTransactions(Transaction[] transactions) {

        ArrayList<Transaction> withdrawalTransactionList = new ArrayList<>();

        for (Transaction transaction : transactions) {
            if (transaction.isWithdrawal()) {
                withdrawalTransactionList.add(transaction);
            }
        }
        return withdrawalTransactionList;
    }

    ArrayList<Transaction> getExpenseCategoryFoodTransactions(ArrayList<Transaction> withdrawalTransactionList) {

        ArrayList<Transaction> expenseCategoryFoodTransactionList = new ArrayList<>();

        for (Transaction transaction : withdrawalTransactionList) {
            if (transaction.getExpenseCategory() == ExpenseCategory.FOOD) {
                expenseCategoryFoodTransactionList.add(transaction);
            }
        }
        return expenseCategoryFoodTransactionList;
    }

    int calculateExpenseCategoryFoodTransactionAmount(ArrayList<Transaction> transactions) {
        int result = 0;
        for (Transaction transaction : transactions) {
            result = result + transaction.getAmount();
        }
        return result;
    }

    public int calculateExpensesAmount(BankAccount bankAccount) {
        Transaction[] allBankAccountTransactions = bankAccount.getTransactions();
        return calculateExpenseCategoryFoodTransactionAmount(getExpenseCategoryFoodTransactions(getWithdrawalTransactions(allBankAccountTransactions)));
    }

}
