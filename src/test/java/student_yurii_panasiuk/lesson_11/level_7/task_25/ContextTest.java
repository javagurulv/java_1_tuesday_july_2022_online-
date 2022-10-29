package student_yurii_panasiuk.lesson_11.level_7.task_25;

import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class ContextTest {

    @Test
    public void executeStrategy() {

        DecimalFormat df = new DecimalFormat("###.###");

        Context context = new Context(new Addition());
        double answer1 = 8;
        assertTrue(context.executeStrategy(3.5, 4.5).equals(df.format(answer1)));

        context = new Context(new Substract());
        double answer2 = -1;
        assertTrue(context.executeStrategy(3.5, 4.5).equals(df.format(answer2)));

        context = new Context(new Divide());
        double answer3 = 0.778;
        assertTrue(context.executeStrategy(3.5, 4.5).equals(df.format(answer3)));




    }
}