package student_ernest_aleskevics.lesson_4.level_6;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class StockDemo {

    public static void main(String[] args) {

        Stock huawei = new Stock("Huawei", 10);
        huawei.updatePrice(15);
        huawei.updatePrice(5);
        huawei.updatePrice(7);
        huawei.getPriceInformation();

    }
}
