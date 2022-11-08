package student_yurii_panasiuk.lesson_11.level_3.task_10;

import java.util.Optional;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface ProductDatabase {

     void save(Product product);

     Optional<Product> findByTitle(String productTitle);

}