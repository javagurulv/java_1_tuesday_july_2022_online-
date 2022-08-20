package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_31;

public class Product {

    String name;

    double regularPrice;

    double discount;

     Product (String name, double regularPrice){
         this.name=name;
         this.regularPrice = regularPrice;

     }

     void printInformation (){

         System.out.println("The product is " + name + " and it costs " + regularPrice);
     }

     double determineDiscountPrice (double discount) {
         return this.regularPrice = regularPrice - discount;

     }

     double calculateDiscount () {

         return this.discount = regularPrice * discount/100;
     }


     void defineFinalPrice () {
         System.out.println("The product " + name + " has price of " + regularPrice );

     }
}
