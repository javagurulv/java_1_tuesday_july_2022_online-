package student_yurii_panasiuk.lesson_11.level_3.task_10;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    public Optional<Product> findByTitle(String productTitle){
        Optional<Product> result = Optional.empty();
         for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                result = Optional.of(product);
                return result;
            }
        }
        return result;
    }
}
