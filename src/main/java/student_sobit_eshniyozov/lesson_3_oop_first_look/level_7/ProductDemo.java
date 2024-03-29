package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product product1 = new Product("Potato");

        System.out.println("=====================================**============================================");
        product1.setRegularPrice(1000);
        product1.setDiscount(15);
        product1.actualPrice();
        product1.printInformation();
        System.out.println("=====================================**============================================");
    }
}
