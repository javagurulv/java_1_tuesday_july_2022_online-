package student_yurii_panasiuk.lesson_14.level_3;

import junit.framework.TestCase;
import org.junit.Assert;

public class GameOfLifeNextGenerationCalculatorTest extends TestCase {

    /*Правило 1:
 Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
     */
    public void testCalculateRule1() {
        boolean[][] currentGeneration = {
                {true, false, true, false, false},
                {true, false, false, true, false},
                {false, true, false, true, false},
                {false, false, true, false, true},
                {true, true, false, false, false}
        };
        boolean[][] nextGeneration = {
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false},
                {false, false, false, false, false}
        };
        GameOfLifeNextGenerationCalculator testRule1 = new GameOfLifeNextGenerationCalculator(currentGeneration);

        boolean[][] culatedNextGeneration = testRule1.calculateRule1(currentGeneration);

        Assert.assertArrayEquals(testRule1.calculateRule1(currentGeneration), nextGeneration);
   }
   /*Правило 2:
Любая живая клетка с больше чем тремя живыми соседями умирает в следующем поколении.
    */
   public void testCalculateRule2() {
       boolean[][] currentGeneration = {
               {true, true, true, false, false},
               {true, true, false, false, false},
               {false, false, true, true, false},
               {false, true, true, true, false},
               {false, false, false, false, false}
       };
       boolean[][] nextGeneration = {
               {true, false, true, false, false},
               {true, false, false, false, false},
               {false, false, false, true, false},
               {false, true, false, true, false},
               {false, false, false, false, false}
       };

       GameOfLifeNextGenerationCalculator testRule2 = new GameOfLifeNextGenerationCalculator(currentGeneration);

       boolean[][] culatedNextGeneration = testRule2.calculateRule3(currentGeneration);

       Assert.assertArrayEquals(testRule2.calculateRule3(currentGeneration), nextGeneration);
   };
   /*Правило 3:
Любая живая клетка с двумя или тремя живыми соседями остаётся живой в следующем поколении.
    */
    public void testCalculateRule3() {
        boolean[][] currentGeneration = {
                {false, false, true, false, false},
                {false, true, true, true, false},
                {true, false, false, false, false},
                {true, true, false, false, false},
                {true, false, false, false, false}
        };
        boolean[][] nextGeneration = {
                {false, false, true, false, false},
                {false, true, true, true, false},
                {true, false, false, false, false},
                {true, true, false, false, false},
                {true, false, false, false, false}
        };

        GameOfLifeNextGenerationCalculator testRule3 = new GameOfLifeNextGenerationCalculator(currentGeneration);

        boolean[][] culatedNextGeneration = testRule3.calculateRule3(currentGeneration);

        Assert.assertArrayEquals(testRule3.calculateRule3(currentGeneration), nextGeneration);
        };

}