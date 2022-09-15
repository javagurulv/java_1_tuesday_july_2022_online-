package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.List;

abstract class Search {

    public abstract List<Book> getBookByTitle(String title);
    public abstract List<Book> getBookByAuthor(Author author);
    public abstract List<Book> getBookByPublicationYear(int publicationYear);

}
