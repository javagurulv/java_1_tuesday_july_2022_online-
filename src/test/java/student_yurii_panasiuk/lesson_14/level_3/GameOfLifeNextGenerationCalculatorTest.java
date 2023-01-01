package student_yurii_panasiuk.lesson_14.level_3;

import junit.framework.TestCase;
import org.junit.Assert;

public class GameOfLifeNextGenerationCalculatorTest extends TestCase {

    /*Правило 1:
 Любая живая клетка с меньше чем двумя живыми соседями умирает в следующем поколении.
     */
    public void testCalculate() {
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
        GameOfLifeNextGenerationCalculator testRuleOne = new GameOfLifeNextGenerationCalculator(currentGeneration);

        boolean[][] culatedNextGeneration = testRuleOne.calculate(currentGeneration);

        Assert.assertArrayEquals(testRuleOne.calculate(currentGeneration), nextGeneration);
   }
}