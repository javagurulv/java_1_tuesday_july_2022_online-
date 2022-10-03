package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    private ArrayList<Book> booksInReader = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isAdded = false;
        if (!alreadyExists(book) && !(isTitleEmpty(book) || isAuthorEmpty(book))) {
            booksInReader.add(book);
            isAdded = true;
        }
        return isAdded;
    }

    private boolean alreadyExists(Book book) {
        boolean exists = false;
        for (Book bookInReader : booksInReader) {
            if (bookInReader.getTitle().equals(book.getTitle()) &&
                    bookInReader.getAuthor().equals(book.getAuthor())) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    private boolean isAuthorEmpty(Book book) {
        return book.getAuthor() == null || book.getAuthor().isEmpty();
    }

    private boolean isTitleEmpty(Book book) {
        return book.getTitle() == null || book.getTitle().isEmpty();
    }

}
