package student_yurii_panasiuk.lesson_14.level_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorTest {

    @Test
    public void testAdd() throws Exception {
        String Test1 = "1,2";
        String Test2 = "-1,2";
        String Test3 = "2";
        String Test4 = "";
        assertEquals(3, new StringCalculator().add(Test1));
        assertEquals(1, new StringCalculator().add(Test2));
        assertEquals(2, new StringCalculator().add(Test3));
        assertEquals(0, new StringCalculator().add(Test4));
    }

    @Test(expected = Exception.class)
    public void invalidInputTest() throws Exception {
        String Test5 = "1,O";
        new StringCalculator().add(Test5);

    }
}