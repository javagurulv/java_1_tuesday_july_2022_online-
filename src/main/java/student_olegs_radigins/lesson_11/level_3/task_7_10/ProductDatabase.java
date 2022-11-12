package student_olegs_radigins.lesson_11.level_3.task_7_10;

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
    //Нет. не является фкункциональным, так как два метода.

}
