package student_yurii_panasiuk.lesson_11.level_3.task_8;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InMemoryDatabaseTest {

    @Test
    public void testFindByTitle() {

        Product product1 = new Product("Milk");
        Product product2 = new Product("Beef");
        Product product3 = new Product("Сucumber");

        InMemoryDatabase testDatabase = new InMemoryDatabase ();
        testDatabase.save(product1);
        testDatabase.save(product2);
        testDatabase.save(product3);

        assertEquals(testDatabase.findByTitle("Milk").getTitle(), (product1.getTitle()));
    }
}