package student_levs_blinnikovs.lesson_3_oop_first_look.level_7_senior.task_31;

class ProductDemo {

    public static void main(String[] args) {

        Product book = new Product("Thinking in Java 4th edition book");
        book.printInformation();

        book.setRegularPrice(30.00);
        book.printInformation();

        book.setDiscount(0.5);
        book.printInformation();

    }

}
