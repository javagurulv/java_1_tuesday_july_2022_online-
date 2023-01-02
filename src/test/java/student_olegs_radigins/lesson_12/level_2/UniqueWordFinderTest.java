package student_olegs_radigins.lesson_12.level_2;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordFinderTest extends TestCase {

    public void testFind() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        assertEquals(Set.of(), uniqueWordFinder.find( " "));
        assertEquals(Set.of("1","2","3"), uniqueWordFinder.find( "1,2,3 2 3 "));
    }
}