package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

import java.util.Optional;

interface OptionalProductDatabase {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);

}
