package student_yurii_panasiuk.lesson_11.level_3.task_8;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 interface ProductDatabase {

     void save(Product product);

     Product findByTitle(String productTitle);

}
