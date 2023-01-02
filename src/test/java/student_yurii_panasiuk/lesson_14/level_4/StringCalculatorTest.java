package student_yurii_panasiuk.lesson_14.level_4;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

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
    @Test
    public void testAddMoreThanTwoNumbers() throws Exception {
        String Test6 = "1,2,-1,-2, 5,5";
        String Test7 = "1,2,-1,-2, 5\n5";
        String Test8 = "1\n"; //- “1\n” - не разрешённый ввод ))
        assertEquals(10, new StringCalculator().add(Test6));
        assertEquals(10, new StringCalculator().add(Test7));
        assertEquals(1, new StringCalculator().add(Test8));
    }
}