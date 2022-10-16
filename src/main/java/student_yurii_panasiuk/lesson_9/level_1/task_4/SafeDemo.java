package student_yurii_panasiuk.lesson_9.level_1.task_4;

import static java.math.BigDecimal.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class SafeDemo {
     public static void main(String[] args) {
     Safe safeDemo = new Safe();

     System.out.println(safeDemo.password);
     safeDemo.password = "password";
     System.out.println(safeDemo.password);

     System.out.println(safeDemo.moneyAmmount);
     safeDemo.moneyAmmount = valueOf(0);
     System.out.println(safeDemo.moneyAmmount);

    }
 }