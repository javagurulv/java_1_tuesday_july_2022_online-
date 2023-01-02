package student_yurii_panasiuk.lesson_14.level_3;

 class LifeCycle {
     boolean[][] currentGeneration;

     public LifeCycle(boolean[][] currentGeneration) {
         this.currentGeneration = currentGeneration;
     }
     boolean[][] calculate() {
         GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator(currentGeneration);
          boolean[][] nextSubCycle;
         nextSubCycle = calculator.calculateRule1(currentGeneration);
         nextSubCycle = calculator.calculateRule2(nextSubCycle);
         nextSubCycle = calculator.calculateRule3(nextSubCycle);
         nextSubCycle = calculator.calculateRule4(nextSubCycle);

         return nextSubCycle;
     }
 }
