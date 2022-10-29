package student_yurii_panasiuk.lesson_11.level_7.task_25;

 class Context {

     Strategy strategy;

     Context(Strategy strategy){
         this.strategy = strategy;
     }

     String executeStrategy(double num1, double num2){
         return strategy.doOperation(num1, num2);
     }
}
