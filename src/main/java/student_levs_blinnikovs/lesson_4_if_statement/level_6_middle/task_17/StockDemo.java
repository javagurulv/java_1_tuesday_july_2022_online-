package student_levs_blinnikovs.lesson_4_if_statement.level_6_middle.task_17;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class StockDemo {

    public static void main (String[] args) {

        Stock googleStock = new Stock("GOOG", 10);

        googleStock.getPriceInformation();

        googleStock.updatePrice(15);
        googleStock.updatePrice(7);
        googleStock.updatePrice(14);

        googleStock.getPriceInformation();

    }

}
