package teacher.lesson_5_arrays_for_loop.lessoncode;

class Stock {
    private String companyName;
    private int actualPrice;
    private int maximumPrice;
    private int minimumPrice;

    public Stock(String companyName,
			int actualPrice,
			int maxPrice,
			int minPrice) {
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        this.maximumPrice = maxPrice;
        this.minimumPrice = minPrice;
    }
    public void updatePrice1(int price) {
        if (price == minimumPrice) {
            this.minimumPrice = price;
        }
    }
    public void updatePrice2(int price) {
        if (price == actualPrice) {
            this.actualPrice = price;
        }
    }
    public void updatePrice3(int price) {
        if (price == maximumPrice) {
            this.maximumPrice = price;
        }
    }

    public void informationPrint() {
        System.out.println("Company " + companyName);
        System.out.println("Company actual price " + actualPrice);
        System.out.println("Company minimum price " + minimumPrice);
        System.out.println("Company maximum price " + maximumPrice);
    }
    public String getCompanyName() { return companyName; }
    public int getActualPrice() { return actualPrice; }
    public int getMinPrice() { return minimumPrice; }
    public int getMaxPrice() { return maximumPrice; }
}
