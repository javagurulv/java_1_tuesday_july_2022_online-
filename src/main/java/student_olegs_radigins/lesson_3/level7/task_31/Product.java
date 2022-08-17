package student_olegs_radigins.lesson_3.level7.task_31;

 class Product {
     String name;
     double regularPrice;
     double discount;

     public Product(String name) {
         this.name = name;
     }

     void setRegularPrice(double regularPrice) {
         this.regularPrice = regularPrice;
     }

     void setDiscount(double discount) {
         this.discount = discount;
     }

     double actualPrice(){
         return regularPrice - discount/100 * regularPrice;

     }

     void printInformation(){
         System.out.println("Actual price is: " + actualPrice());
     }
}
