package student_yurii_panasiuk.lesson_14.level_3;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {
    private boolean[][] grid;
    private boolean[][] nextGrid;

     GameOfLifeNextGenerationCalculator(boolean[][] grid) {
        this.grid = grid;
        nextGrid = new boolean[grid.length][grid[0].length];
    }

     boolean[][] calculateRule1(boolean[][] currentGeneration) {
    // Rule One. Any live cell with fewer than two live neighbours dies, as if by underpopulation.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int neighbors = countNeighbors(r, c);
                if (currentGeneration[r][c]) {
                    if (neighbors < 2) {
                        nextGrid[r][c] = false;
                    }
                    else {nextGrid[r][c] = currentGeneration[r][c];}
                }
            }
        }
        return nextGrid;
    }
     boolean[][] calculateRule2(boolean[][] currentGeneration) {
    // Rule Two. Any live cell with more than three live neighbours dies, as if by overpopulation.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int neighbors = countNeighbors(r, c);
                if (currentGeneration[r][c]) {
                    if (neighbors > 3  ) {
                        nextGrid[r][c] = false;
                    }
                    else {nextGrid[r][c] = currentGeneration[r][c];}
                }
            }
        }
        return nextGrid;
    }

     boolean[][] calculateRule3(boolean[][] currentGeneration) {
    // Rule Three. Any live cell with two or three live neighbours lives on to the next generation.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int neighbors = countNeighbors(r, c);
                if (currentGeneration[r][c]) {
                    if (neighbors >= 2 && neighbors <= 3  ) {
                        nextGrid[r][c] = true;
                    }
                    else {nextGrid[r][c] = currentGeneration[r][c];}
                }
            }
        }
        return nextGrid;
   }
    boolean[][] calculateRule4(boolean[][] currentGeneration) {
   // Rule Four. Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
   // Print(currentGeneration);
       int r = 0;
       int c = 0;
       for ( r = 0; r < grid.length; r++) {
           for ( c = 0; c < grid[0].length; c++) {
               int neighbors = countNeighbors(r, c);
              // System.out.println("проверка");
              // System.out.println("ряд " + r + " / " + "колонка " + c + " / " + "соседи " + neighbors);
              // System.out.println("значение " + grid[r][c]);
              // System.out.println();
               if (!currentGeneration[r][c] && neighbors == 3) {
                       nextGrid[r][c] = true;
                      //S ystem.out.println("ряд " + r + " / " + "колонка " + c );
                      // System.out.println("изменено на true");
                      // System.out.println("значение после проверки на false " + nextGrid[r][c]);
                      // System.out.println();
               }
               else {nextGrid[r][c] = currentGeneration[r][c];}
           }
         // System.out.println("ряд " + r );
         // Print(nextGrid);
       }
       return nextGrid;
   }
    private int countNeighbors(int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {
                if (!(r == row && c == col) && isValid(r, c) && grid[r][c]) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }
     void Print ( boolean[][] array ) {
           for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println();
    }
}

