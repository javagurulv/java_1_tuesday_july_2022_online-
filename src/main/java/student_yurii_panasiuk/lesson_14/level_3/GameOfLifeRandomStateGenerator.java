package student_yurii_panasiuk.lesson_14.level_3;

 class GameOfLifeRandomStateGenerator {
     private boolean[][] grid;

     public GameOfLifeRandomStateGenerator(boolean[][] grid) {
         this.grid = grid;
     }

     boolean[][] fillRandomly() {
         for (int r = 0; r < grid.length; r++) {
             for (int c = 0; c < grid[0].length; c++) {
                 double randomValue = Math.random();

                 // Assign the value to the array
                 if (randomValue < 0.5) {
                     grid[r][c] = false;
                 } else {
                     grid[r][c] = true;
                 }
             }
         }
        return grid;
     }
 }
