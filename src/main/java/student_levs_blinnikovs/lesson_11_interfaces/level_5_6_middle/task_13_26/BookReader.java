package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String[] showBooks();

    String[] showBooks(String author);

}
