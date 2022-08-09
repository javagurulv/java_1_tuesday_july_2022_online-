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

    @CodeReviewComment(student = "Should it be each own test methods? "
			+ "And also should it be all one scenario from 999 ... and then just call getCurrentPrice? ")
	@CodeReviewComment(teacher = "Each test scenario in separate test method.")
    public static void main(String[] args) {

        // this first 10 -> .. 77
        Stock visaStock = new Stock("VISA", 10);

        visaStock.updatePrice(12);
        visaStock.updatePrice(5);
        visaStock.updatePrice(7);
        visaStock.updatePrice(99);
        visaStock.updatePrice(77);

        visaStock.getPriceInformation();

        // second part of tests
        //Изменение цены акции: 999  = Максимальная цена за указанный период: 999
        Stock test1 = new Stock("TES1", 999);
        System.out.println("Should return max 999: ");
        test1.getPriceInformation();

        //Изменение цены акции: 999 -> 1  = Максимальная цена за указанный период: 999
        Stock test2 = new Stock("TES2", 999);
        test2.updatePrice(1);
        System.out.println("Should return max 999: ");
        test2.getPriceInformation();

        //Изменение цены акции: 999 -> 2 -> 1000 = Максимальная цена за указанный период: 1000
        Stock test3 = new Stock("TES3", 999);
        test3.updatePrice(2);
        test3.updatePrice(1000);
        System.out.println("Should return max 1000: ");
        test3.getPriceInformation();

        //Изменение цены акции: 999 -> 2 -> 1000 -> 8 = Максимальная цена за указанный период: 1000
        Stock test4 = new Stock("TES4", 999);
        test4.updatePrice(2);
        test4.updatePrice(1000);
        test4.updatePrice(8);
        System.out.println("Should return max 1000: ");
        test4.getPriceInformation();

        //Изменение цены акции: 9 -> 27 = Максимальная цена за указанный период: 27
        Stock test5 = new Stock("TES5", 9);
        test5.updatePrice(27);
        System.out.println("Should return max 27: ");
        test5.getPriceInformation();




    }

}
