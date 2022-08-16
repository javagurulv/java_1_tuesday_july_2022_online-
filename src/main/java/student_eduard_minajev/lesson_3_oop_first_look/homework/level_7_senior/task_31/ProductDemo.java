package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_31;

import java.util.Scanner;

 class ProductDemo {

     public static void main(String[] args){

         System.out.println("Please define the product");
         Scanner scannerName = new Scanner(System.in);
         String productName = scannerName.nextLine();

         System.out.println("Please define a price of this product!");
         Scanner scannerPrice = new Scanner (System.in);
         double productPrice = scannerPrice.nextDouble();

         Product product1 = new Product(productName,productPrice);
         product1.printInformation();

         System.out.println("Please define a % discount for this product!");
         Scanner scannerDiscount = new Scanner(System.in);
         double productDiscount = scannerDiscount.nextDouble();
         product1.calculateDiscount();
         product1.determineDiscountPrice(productDiscount);
         product1.defineFinalPrice();








     }
}
