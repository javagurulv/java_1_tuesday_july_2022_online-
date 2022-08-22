package student_eduard_minajev.lesson_4_if_statement.level_6_middle;

public class Stock {

    String companyName;

    int currentPrice;

    int maxPrice;

    int minPrice;

    Stock (String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.maxPrice = currentPrice;
        this.minPrice = currentPrice;
    }

    void updatePrice (int newPrice) {
        this.currentPrice = newPrice;
        if (currentPrice > maxPrice) {
            this.maxPrice = currentPrice;
        } else if (currentPrice < minPrice) {
            this.minPrice = currentPrice;
        }
    }
    public void getPriceInformation (){
        System.out.println("Company " + companyName + " current stock price is " + currentPrice + " with all time maximum price " + maxPrice + " and with all time minimum price " + minPrice );
    }

}
