package student_olegs_radigins.lesson_11.level_3.task_7_10;

import junit.framework.TestCase;

import java.util.Optional;

public class OptionalInMemoryDatabaseTest extends TestCase {
    OptionalInMemoryDatabase optionalInMemoryDatabase = new OptionalInMemoryDatabase();
    Product milk = new Product("Milk");
    Product bread = new Product("Bread");
    Product meat = new Product("Meat");

    public void testFindByTitle() {
        optionalInMemoryDatabase.save(milk);
        optionalInMemoryDatabase.save(bread);
        optionalInMemoryDatabase.save(meat);;
        assertEquals(Optional.of(milk), optionalInMemoryDatabase.findByTitle("Milk"));
        assertEquals(Optional.empty(), optionalInMemoryDatabase.findByTitle("milk"));

    }
}