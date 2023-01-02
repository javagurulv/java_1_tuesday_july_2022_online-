package student_yurii_panasiuk.lesson_14.level_3;

import java.util.Arrays;

class GameOfLifeNextGenerationCalculator {
    private boolean[][] grid;
    private boolean[][] nextGrid;

    public GameOfLifeNextGenerationCalculator(boolean[][] grid) {
        this.grid = grid;
        nextGrid = new boolean[grid.length][grid[0].length];
    }

    public boolean[][] calculateRule1(boolean[][] currentGeneration) {
        // Rule One. Any live cell with fewer than two live neighbours dies, as if by underpopulation.
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int neighbors = countNeighbors(r, c);
                if (grid[r][c]) {
                    if (neighbors < 2) {
                        nextGrid[r][c] = false;
                    }
                }
            }
        }
        return nextGrid;
    }

        // Rule Two. Any live cell with two or three live neighbours lives on to the next generation.
        public boolean[][] calculateRule2(boolean[][] currentGeneration) {
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                int neighbors = countNeighbors(r, c);
                if (grid[r][c]) {
                    if (neighbors >= 2 && neighbors <= 3  ) {
                        nextGrid[r][c] = true;
                    }
                }
            }
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

}

