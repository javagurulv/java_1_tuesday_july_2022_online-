package student_yurii_panasiuk.lesson_14.level_3;

 class DemoForDebugging {


     public static void main(String[] args) {
         boolean[][] currentGeneration = {
                 {false, false, false, false, false},
                 {false, false, true, false, false},
                 {true, false, true, true, false},
                 {true, false, false, false, false},
                 {true, false, false, false, false}
         };
         boolean[][] nextGeneration = {
                 {false, false, false, false, false},
                 {false, true, true, true, false},
                 {true, false, true, true, false},
                 {true, false, false, false, false},
                 {true, false, false, false, false}
         };

         GameOfLifeNextGenerationCalculator testRule4 = new GameOfLifeNextGenerationCalculator(currentGeneration);
         boolean[][] culatedNextGeneration = testRule4.calculateRule4(currentGeneration);
         testRule4.Print(culatedNextGeneration);

         GameOfLifeRandomStateGenerator generator = new GameOfLifeRandomStateGenerator(new boolean[50][50]);

         GameOfLifeDisplayer displayer = new GameOfLifeDisplayer(new GliderGun().create());
        // displayer.display();
         displayer.startAnimation();


     }
}
