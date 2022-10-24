package student_yurii_panasiuk.lesson_11.level_3.task_10;

import java.util.Optional;

interface ProductDatabase {

     void save(Product product);

     Optional<Product> findByTitle(String productTitle);

}