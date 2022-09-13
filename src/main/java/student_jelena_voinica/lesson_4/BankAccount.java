package student_jelena_voinica.lesson_4;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(teacher = "На будущее класс и Demo класс создавайте в разных файлах.")
 class BankAccount {
     String ownerFirstName;
     String ownerLastName;
     int moneyAmount;

     BankAccount(String ownerFirstName,
                 String ownerLastName,
                 int moneyAmount){
         this.ownerFirstName = ownerFirstName;
         this.ownerLastName = ownerLastName;
         this.moneyAmount = moneyAmount;
     }
     String getOwnerFirstName(){
         return this.ownerFirstName;
     }
     String getOwnerLastName(){
         return this.ownerLastName;
     }
     int getMoneyAmount(){
         return this.moneyAmount;
     }
}

class BankAccountDemo{

     public static void main(String[]args){
         BankAccount bankAccount = new BankAccount("Viktor","Savonin",100000);
         String ownerFirstName = bankAccount.getOwnerFirstName();
         String ownerLastName = bankAccount.getOwnerLastName();
         int moneyAmount = bankAccount.getMoneyAmount();

         System.out.println("Owner first name = " + ownerFirstName);
         System.out.println("Owner last name = " + ownerLastName);
         System.out.println("Money amount = " + moneyAmount);


     }
}
