package student_olegs_radigins.lesson_11.level_3.task_7_10;

import java.util.Optional;

interface OptionalProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
