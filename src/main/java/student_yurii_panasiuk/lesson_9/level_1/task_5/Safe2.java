package student_yurii_panasiuk.lesson_9.level_1.task_5;

import java.math.BigDecimal;

class Safe2 {

     private   String password ;
     private BigDecimal moneyAmmount;

      Safe2(String password, BigDecimal moneyAmmount) {
          this.password = password;
          this.moneyAmmount = moneyAmmount;
     }



     String putMoney (BigDecimal moneyAmmount, String password) {
          if (password.equals(this.password)) {
               this.moneyAmmount = this.moneyAmmount.add(moneyAmmount);
               return "deposit success";
          }
               else {
               return "invalid password";
               }
          }


      String getMoney (BigDecimal moneyAmmount, String password) {
          if (password.equals(this.password)) {
               this.moneyAmmount = this.moneyAmmount.subtract(moneyAmmount);
               return "withdraw success";
          }
               else {
                    return "invalid password";
               }
          }
      String showMoneyAmmount (String password) {
           if (password.equals(this.password)) {

                return this.moneyAmmount.toString();
           }
           else {
                return "invalid password";
           }

      }



     }

