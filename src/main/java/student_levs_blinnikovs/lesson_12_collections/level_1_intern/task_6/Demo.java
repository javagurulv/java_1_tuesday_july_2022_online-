package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_6;

class Demo {
    public static void main(String[] args) {
        BookDatabaseImpl db = new BookDatabaseImpl();

          Book book1 = new Book("Sally Rooney", "Normal People");
          Book book2 = new Book("1984", "George Orwell");
          Book book3 = new Book("Theodore Dreiser", "The Financier");

          System.out.println("Result of 1st save should return 1: " + db.save(book1));
          System.out.println("Result of 2nd save should return 2: " + db.save(book2));
          System.out.println("Result of 3rd save should return 3: " + db.save(book3));

        System.out.println("Id of 1st book should return 1: " + book1.getId());
        System.out.println("Id of 2nd book should return 2: " + book2.getId());
        System.out.println("Id of 3rd book should return 3: " + book3.getId());


    }
}
