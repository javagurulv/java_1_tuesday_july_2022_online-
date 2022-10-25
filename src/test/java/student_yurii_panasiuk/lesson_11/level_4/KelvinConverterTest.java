package student_yurii_panasiuk.lesson_11.level_4;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class KelvinConverterTest  {

       TemperatureConverter converter;

        @Before
        public void init() {
            converter = new KelvinConverter();
        }

        @Test
        public void test1() {
            double result = converter.convert(0);
            assertEquals (result, 273.15, 0.0001);
            double result2 = converter.convert(25);
            assertEquals (result2, 298.15, 0.0001);
            assertNotEquals(result2, 273.15, 0.0001);
        }
 }
