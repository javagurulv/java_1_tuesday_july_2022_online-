package student_yurii_panasiuk.lesson_11.level_3.task_8;


import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

// тесты через JUnit позитивные только

@CodeReview(approved = true)
public class InMemoryDatabase implements ProductDatabase {

     List<Product> products = new ArrayList<>();

     @Override
     public void save(Product product){
         products.add(product);
     }

    @Override
    public Product findByTitle(String productTitle){
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return product;
            }
        }
        return null;
    }
}
