package student_sobit_eshniyozov.lesson_4_if_statement.level_6;

class StockDemo {
    public static void main(String[] args) {
    Stock stock = new Stock("FutureDream", 10);
    stock.getPriceInformation();
    stock.updatePrice(15);
    stock.updatePrice(7);
    stock.updatePrice(14);
    stock.getPriceInformation();
    }
}
