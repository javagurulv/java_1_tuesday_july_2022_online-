package student_yurii_panasiuk.lesson_11.level_7.task_25;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class StrategyDemo {

     public static void main(String[] args) {

         Context context = new Context(new Addition());
         System.out.println (" 3.5 + 4.5 = " + context.executeStrategy(3.5, 4.5));

         context = new Context(new Substract());
         System.out.println (" 3.5 - 4.5 = " + context.executeStrategy(3.5, 4.5));

         context = new Context(new Divide());
         System.out.println (" 3.5 / 4.5 = " + context.executeStrategy(3.5, 4.5));
     }
}
