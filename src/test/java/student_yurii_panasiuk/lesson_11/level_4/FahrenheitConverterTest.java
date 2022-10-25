package student_yurii_panasiuk.lesson_11.level_4;

//import junit.framework.TestCase; // какойто JUnit не тот включил ))
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FahrenheitConverterTest {
    TemperatureConverter converter;

    @Before
    public void init() {
        converter = new FahrenheitConverter();
    }
    @Test
    public void testConvert() {
        double result = converter.convert(0);
        Assert.assertEquals(result, 32.0, 0.0001);
        double result2 = converter.convert(25);
        Assert.assertEquals(result2, 77.0, 0.0001);
        assertNotEquals(result2, 32.0, 0.0001);
    }
}

