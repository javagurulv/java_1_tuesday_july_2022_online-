package student_olegs_radigins.lesson_3.level4.task_17;

class BankAccountDemo {
    public static void main(String[] args) {
            BankAccount bankAccount = new BankAccount("Viktor", "Savonin", 100000);
            String ownerFirstName = bankAccount.getOwnerFirstName();
            String ownerLastName = bankAccount.getOwnerLastName();
            int moneyAmount = bankAccount.getMoneyAmount();
            System.out.println("Owner first name = " + ownerFirstName);
            System.out.println("Owner last name = " + ownerLastName);
            System.out.println("Money amount = " + moneyAmount);
        }
    }

