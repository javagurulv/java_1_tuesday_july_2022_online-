package student_yurii_panasiuk.lesson_9.level_1.task_5;


import static java.math.BigDecimal.valueOf;

class Safe2Demo {
     public static void main(String[] args) {
     Safe2 safe2Demo = new Safe2("pass", valueOf(10));

             System.out.println(safe2Demo.showMoneyAmmount("pass"));

         safe2Demo.putMoney(valueOf(10), "pass");
         System.out.println(safe2Demo.showMoneyAmmount("pass"));

         safe2Demo.getMoney(valueOf(20), "pass");
         System.out.println(safe2Demo.showMoneyAmmount("pass"));

    }
 }