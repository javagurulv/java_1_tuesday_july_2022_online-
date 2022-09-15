package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.List;

class Search {

    BookDatabase bookDatabase;

    public List<Book> getBookByTitle(String title) {
        return List.of(bookDatabase.getBookByTitle(title));
    }
    public List<Book> getBookByAuthor(Author author) {
        return List.of(bookDatabase.getBookByAuthor(author));
    }
    public List<Book> getBookByPublicationYear(int publicationYear) {
        return List.of(bookDatabase.getBookByPublicationYear(publicationYear));
    }

}
