package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

import teacher.codereview.CodeReview;

// не является функциональным так как содержит два (а не один) абстрактных метода.
@CodeReview(approved = true)
interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
