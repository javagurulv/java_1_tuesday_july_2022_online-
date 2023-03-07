package student_olegs_radigins.lesson_4.level_6;

class Stock {
    String name;
    int price;
    int minPrice;
    int maxPrice;


    public Stock(String name, int price) {
        minPrice = price;
        maxPrice = price;
        this.name = name;
        this.price = price;
    }

    void updatePrice(int newPrice) {

        if (newPrice > maxPrice) {
            this.maxPrice = newPrice;
        }

        if (newPrice < minPrice) {
            this.minPrice = newPrice;
        }
    }
    void getPriceInformation () {
        System.out.println("Company = " + this.name + " Current Price = " + this.price + ", "
                + "Min Price = " + this.minPrice + ", " +
                "Max Price = " + this.maxPrice + ". ");
    }
}

