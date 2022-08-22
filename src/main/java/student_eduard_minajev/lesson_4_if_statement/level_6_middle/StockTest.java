package student_eduard_minajev.lesson_4_if_statement.level_6_middle;

public class StockTest {

    public static void main(String[] args) {

        Stock stock1 = new Stock("Boeing", 10);
        stock1.updatePrice(12);
        stock1.updatePrice(5);
        stock1.updatePrice(7);
        stock1.updatePrice(99);
        stock1.updatePrice(77);
        stock1.getPriceInformation();
    }
}
