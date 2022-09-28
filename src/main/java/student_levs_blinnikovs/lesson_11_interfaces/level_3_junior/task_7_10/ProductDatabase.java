package student_levs_blinnikovs.lesson_11_interfaces.level_3_junior.task_7_10;

// не является функциональным так как содержит два (а не один) абстрактных метода.
interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);

}
