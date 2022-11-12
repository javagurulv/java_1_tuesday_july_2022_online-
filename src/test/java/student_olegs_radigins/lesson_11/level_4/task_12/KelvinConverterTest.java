package student_olegs_radigins.lesson_11.level_4.task_12;

import junit.framework.TestCase;

public class KelvinConverterTest extends TestCase {

    public void testConvert() {
        KelvinConverter kelvinConverter = new KelvinConverter();
        assertEquals(283.15,kelvinConverter.convert(10));
    }
}