package student_ernest_aleskevics.lesson_4.level_6;

public class Stock {

    String companyName;
    int currentPrice, minPrice, maxPrice;

    Stock (String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (maxPrice < currentPrice){
            maxPrice = currentPrice;
        } else if (minPrice > currentPrice){
            minPrice = currentPrice;
        }
    }
    void getPriceInformation(){
        System.out.println("Company: " + companyName + ". Current price: " + currentPrice + ". Min price: " + minPrice + ". Max price: " + maxPrice);
    }

    public int getMinimumPrice(){
        return minPrice;
    }

    public int getMaximumPrice(){
        return maxPrice;
    }
}
