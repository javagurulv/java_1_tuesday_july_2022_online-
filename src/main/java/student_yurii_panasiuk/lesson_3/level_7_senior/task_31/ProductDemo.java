package student_yurii_panasiuk.lesson_3.level_7_senior.task_31;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class ProductDemo {


    public static void main(String[] args){

    Product productOne = new Product("Бревно");
    productOne.setRegularPrice (100.0);
    productOne.setDiscount(10);
      productOne.printInformation();

    }
}
