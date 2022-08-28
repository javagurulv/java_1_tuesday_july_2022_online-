package student_ernest_aleskevics.lesson_4.level_6;

public class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.stockTestOne();
        stockTest.stockTestTwo();
        stockTest.stockTestThree();
        stockTest.stockTestFour();
        stockTest.stockTestFive();
        stockTest.stockTestSix();
    }
    public void stockTestOne(){
        int startPrice = 10;
        int expectedMinResult = 5;

        Stock testStock = new Stock("Test", startPrice);
        testStock.updatePrice(12);
        testStock.updatePrice(5);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);

        int realMinResult = testStock.getMinimumPrice();
        if (realMinResult == expectedMinResult) {
            System.out.println("Test 1 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
    public void stockTestTwo(){
        int startPrice = 999;
        int expectedResult = 999;

        Stock testStock = new Stock("Test", startPrice);

        int realResult = testStock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 2 = OK");
        } else {
            System.out.println("Test 2 = FAIL");
        }
    }
    public void stockTestThree(){
        int startPrice = 999;
        int expectedResult = 999;

        Stock testStock = new Stock("Test", startPrice);
        testStock.updatePrice(1);

        int realResult = testStock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 3 = OK");
        } else {
            System.out.println("Test 3 = FAIL");
        }
    }
    public void stockTestFour(){
        int startPrice = 999;
        int expectedResult = 1000;

        Stock testStock = new Stock("Test", startPrice);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);

        int realResult = testStock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 4 = OK");
        } else {
            System.out.println("Test 4 = FAIL");
        }
    }
    public void stockTestFive(){
        int startPrice = 999;
        int expectedResult = 1000;

        Stock testStock = new Stock("Test", startPrice);
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        testStock.updatePrice(8);

        int realResult = testStock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 5 = OK");
        } else {
            System.out.println("Test 5 = FAIL");
        }
    }
    public void stockTestSix(){
        int startPrice = 9;
        int expectedResult = 27;

        Stock testStock = new Stock("Test", startPrice);
        testStock.updatePrice(27);

        int realResult = testStock.getMaximumPrice();
        if (realResult == expectedResult) {
            System.out.println("Test 6 = OK");
        } else {
            System.out.println("Test 6 = FAIL");
        }
    }




}

