package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

import java.util.Optional;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class OptionalCompatibleInMemoryDatabaseTest {

    public static void main(String[] args) {
        OptionalCompatibleInMemoryDatabaseTest test = new OptionalCompatibleInMemoryDatabaseTest();

        test.emptyDatabaseTest();

        test.firstSaveShouldIncreaseOptionalCompatibleInMemoryDatabaseLengthByOne();
        test.nextSaveShouldIncreaseOptionalCompatibleInMemoryDatabaseLengthByOne();
        test.shouldAddNextAtLastPosition();

        test.shouldSaveAndFindFirstProduct();
        test.shouldSaveAndFindNextProduct();
        test.shouldSaveAndFindBoth();
    }

    void emptyDatabaseTest() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        printTestResult(db.findByTitle("test").isEmpty());
    }

    void firstSaveShouldIncreaseOptionalCompatibleInMemoryDatabaseLengthByOne() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        db.save(productA);
        int expectedDataBaseLength = 1;
        int realDataBaseLength = db.products.length;
        printTestResult(expectedDataBaseLength == realDataBaseLength);
    }

    void nextSaveShouldIncreaseOptionalCompatibleInMemoryDatabaseLengthByOne() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        int expectedDataBaseLength = 2;
        int realDataBaseLength = db.products.length;
        printTestResult(expectedDataBaseLength == realDataBaseLength);
    }

    void shouldSaveAndFindFirstProduct() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        db.save(productA);
        Optional<Product> findByTitleResult = db.findByTitle("A");
        printTestResult(productA.equals(findByTitleResult.orElse(null)));
    }

    void shouldSaveAndFindNextProduct() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Optional<Product> findByTitleResult = db.findByTitle("B");
        printTestResult(productB.equals(findByTitleResult.orElse(null)));
    }

    void shouldSaveAndFindBoth() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Optional<Product> findByTitleResultProductA = db.findByTitle("A");
        Optional<Product> findByTitleResultProductB = db.findByTitle("B");
        printTestResult(productA.equals(findByTitleResultProductA.orElse(null))
                && productB.equals(findByTitleResultProductB.orElse(null)));
    }

    void shouldAddNextAtLastPosition() {
        OptionalCompatibleInMemoryDatabase db = new OptionalCompatibleInMemoryDatabase();
        Product productA = new Product("A");
        Product productB = new Product("B");
        db.save(productA);
        db.save(productB);
        Product realAtLastPosition = db.products[db.products.length - 1];
        printTestResult(productB.equals(realAtLastPosition));
    }

}
