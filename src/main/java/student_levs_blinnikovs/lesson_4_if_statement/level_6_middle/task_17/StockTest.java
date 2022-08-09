package student_levs_blinnikovs.lesson_4_if_statement.level_6_middle.task_17;

/*
Написать тестовые сценарии для класса Stock в классе StockTest.

10 -> 12 -> 5 -> 7 -> 99 -> 77

Test case max:

Изменение цены акции: 999  = Максимальная цена за указанный период: 999
Изменение цены акции: 999 -> 1  = Максимальная цена за указанный период: 999
Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный период: 1000
Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный период: 1000
Изменение цены акции: 9 -> 27 = Максимальная цена за указанный период: 27
 */

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = true)
class StockTest {

    // 10 -> 12 -> 5 -> 7 -> 99 -> 77
    public void stockTest0() {
        int startingPrice = 10;
        int expectedMaxPrice = 99;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        testStock.updatePrice(12);
        testStock.updatePrice(5);
        testStock.updatePrice(7);
        testStock.updatePrice(99);
        testStock.updatePrice(77);
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }


    //Изменение цены акции: 999  = Максимальная цена за указанный период: 999
    public void stockTest1() {
        int startingPrice = 999;
        int expectedMaxPrice = 999;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }

    //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный период: 999
    public void stockTest2() {
        int startingPrice = 999;
        int expectedMaxPrice = 999;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        testStock.updatePrice(1);
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }

    //Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный период: 1000
    public void stockTest3() {
        int startingPrice = 999;
        int expectedMaxPrice = 1000;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }

    //Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный период: 1000
    public void stockTest4() {
        int startingPrice = 999;
        int expectedMaxPrice = 1000;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        testStock.updatePrice(2);
        testStock.updatePrice(1000);
        testStock.updatePrice(8);
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }

    //Изменение цены акции: 9 -> 27 = Максимальная цена за указанный период: 27
    public void stockTest5() {
        int startingPrice = 9;
        int expectedMaxPrice = 27;
        Stock testStock = new Stock("TEST", startingPrice);
        // steps
        testStock.updatePrice(27);
        int realMaxPrice = testStock.getMaximumStockPrice();

        // check
        if (realMaxPrice == expectedMaxPrice) {
            System.out.println("Stock test = OK");
        } else {
            System.out.println("Stock test = FAIL");
        }
    }

    @CodeReviewComment(student = "Should it be each own test methods? "
			+ "And also should it be all one scenario from 999 ... and then just call getCurrentPrice? ")
	@CodeReviewComment(teacher = "Each test scenario in separate test method.")
    public static void main(String[] args) {

        // tests 2
        StockTest multiplePriceChangeTest = new StockTest();

        multiplePriceChangeTest.stockTest0();
        multiplePriceChangeTest.stockTest1();
        multiplePriceChangeTest.stockTest2();
        multiplePriceChangeTest.stockTest3();
        multiplePriceChangeTest.stockTest4();
        multiplePriceChangeTest.stockTest5();

    }
}
