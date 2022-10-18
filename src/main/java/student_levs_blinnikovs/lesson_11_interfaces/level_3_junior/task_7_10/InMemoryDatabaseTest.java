package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class InMemoryDatabaseTest {

    public static void main(String[] args) {
        InMemoryDatabaseTest test = new InMemoryDatabaseTest();

        test.emptyDatabaseTest();

        test.firstSaveShouldIncreaseInMemoryDataBaseLengthByOne();
        test.nextSaveShouldIncreaseInMemoryDataBaseLengthByOne();
        test.shouldAddNextAtLastPosition();

        test.shouldSaveAndFindFirstProduct();
        test.shouldSaveAndFindNextProduct();
        test.shouldSaveAndFindBoth();
    }

    void emptyDatabaseTest() {
        InMemoryDatabase db = new InMemoryDatabase();
        printTestResult(null == db.findByTitle("test"));
    }

    void firstSaveShouldIncreaseInMemoryDataBaseLengthByOne() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        db.save(productA);
        int expectedDataBaseLength = 1;
        int realDataBaseLength = db.products.length;
        printTestResult(expectedDataBaseLength == realDataBaseLength);
    }

    void nextSaveShouldIncreaseInMemoryDataBaseLengthByOne() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        int expectedDataBaseLength = 2;
        int realDataBaseLength = db.products.length;
        printTestResult(expectedDataBaseLength == realDataBaseLength);
    }

    void shouldSaveAndFindFirstProduct() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        db.save(productA);
        Product findByTitleResult = db.findByTitle("A");
        printTestResult(productA.equals(findByTitleResult));
    }

    void shouldSaveAndFindNextProduct() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Product findByTitleResult = db.findByTitle("B");
        printTestResult(productB.equals(findByTitleResult));
    }

    void shouldSaveAndFindBoth() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Product findByTitleResultProductA = db.findByTitle("A");
        Product findByTitleResultProductB = db.findByTitle("B");
        printTestResult(productA.equals(findByTitleResultProductA) && productB.equals(findByTitleResultProductB));
    }

    void shouldAddNextAtLastPosition() {
        InMemoryDatabase db = new InMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Product realAtLastPosition = db.products[db.products.length - 1];
        printTestResult(productB.equals(realAtLastPosition));
    }

}
