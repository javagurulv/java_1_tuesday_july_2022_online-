package student_olegs_radigins.lesson_11.level_4.task_12;

import junit.framework.TestCase;

public class FahrenheitConverterTest extends TestCase {

    public void testConvert() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        assertEquals(50.0,fahrenheitConverter.convert(10));
    }
}