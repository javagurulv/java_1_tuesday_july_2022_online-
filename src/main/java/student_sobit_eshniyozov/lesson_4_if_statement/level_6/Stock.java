package student_sobit_eshniyozov.lesson_4_if_statement.level_6;

class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock (String name, int currentPrice){
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }
    void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (currentPrice > maxPrice) {
            this.maxPrice = currentPrice;
        } else if (currentPrice < minPrice) {
            this.minPrice = currentPrice;
        }
    }
    void getPriceInformation(){
        System.out.println("Name of Company: "+name);
        System.out.println("Current price: "+this.currentPrice);
        System.out.println("Min price: "+this.minPrice);
        System.out.println("Max price: "+this.maxPrice);
    }
}

