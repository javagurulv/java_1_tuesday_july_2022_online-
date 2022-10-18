package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_24;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    boolean markRead(Book book, boolean isRead);

    String[] showBooks();

    String[] showBooksByAuthor(String author);

    String[] showBooksByTitle(String title);

    String[] showReadBooks();

    String[] showNotReadBooks();

}
