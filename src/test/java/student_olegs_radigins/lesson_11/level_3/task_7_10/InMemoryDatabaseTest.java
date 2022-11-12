package student_olegs_radigins.lesson_11.level_3.task_7_10;

import junit.framework.TestCase;

public class InMemoryDatabaseTest extends TestCase {
    InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
    Product milk = new Product("Milk");
    Product bread = new Product("Bread");
    Product meat = new Product("Meat");


    public void testSave() {

    }

    public void testFindByTitle() {
        inMemoryDatabase.save(milk);
        inMemoryDatabase.save(bread);
        inMemoryDatabase.save(meat);;
        assertEquals("Milk", inMemoryDatabase.findByTitle("Milk").getTitle());
        assertEquals(null, inMemoryDatabase.findByTitle("milk"));
    }
}