package student_yurii_panasiuk.lesson_12.level_2_3_4;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinderTest extends TestCase {

    public void testFind() {
        String test = "word1,word1   word2 word3@word4?word5.word6 word6 word6";
        Set<String> result = new HashSet<>();
        result.add("word1");
        result.add("word2");
        result.add("word3");
        result.add("word4");
        result.add("word5");
        result.add("word6");

        assertEquals(new UniqueWordFinder().find(test), result); // незнаю как работает Equals (пока еще) но работает
    }
}