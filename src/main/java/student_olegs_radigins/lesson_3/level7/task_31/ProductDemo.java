package student_olegs_radigins.lesson_3.level7.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ProductDemo {
    public static void main(String[] args) {
        Product bread = new Product("Bread");
        bread.setRegularPrice(2);
        bread.setDiscount(20);
        bread.printInformation();

    }
}
