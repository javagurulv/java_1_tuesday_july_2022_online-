package student_olegs_radigins.lesson_11.level_3.task_7;

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}

// Нет, это не функциональный интерфейс.Два метода