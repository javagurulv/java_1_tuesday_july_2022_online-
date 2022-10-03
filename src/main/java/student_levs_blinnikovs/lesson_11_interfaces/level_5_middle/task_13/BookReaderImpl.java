package student_levs_blinnikovs.lesson_11_interfaces.level_5_middle.task_13;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    private ArrayList<Book> booksInReader = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isAdded = false;
        if (!alreadyExists(book)) {
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

}
