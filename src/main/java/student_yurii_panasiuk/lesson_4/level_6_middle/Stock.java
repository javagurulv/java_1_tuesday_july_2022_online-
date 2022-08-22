package student_yurii_panasiuk.lesson_4.level_6_middle;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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
   System.out.print("Company = " + this.name + ", ");
   System.out.print("Current Price = " + this.price + ", ");
   System.out.print("Min Price = " + this.minPrice + ", ");
   System.out.println("Max Price = " + this.maxPrice + ", ");



  }
  }
