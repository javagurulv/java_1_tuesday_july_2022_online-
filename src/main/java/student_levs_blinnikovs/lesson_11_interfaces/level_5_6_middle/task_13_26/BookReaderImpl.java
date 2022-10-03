package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

import java.util.ArrayList;

class BookReaderImpl implements BookReader {

    private ArrayList<Book> booksInReader = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        boolean isAdded = false;
        if (!existsInReader(book) && !(titleNotFilledIn(book) || authorNotFilledIn(book))) {
            booksInReader.add(book);
            isAdded = true;
        }
        return isAdded;
    }

    @Override
    public boolean removeBook(Book book) {
        boolean isRemoved = false;
        if (existsInReader(book)) {
            booksInReader.remove(book);
            isRemoved = true;
        }
        return isRemoved;
    }

    private boolean existsInReader(Book book) {
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

    private boolean authorNotFilledIn(Book book) {
        return book.getAuthor() == null || book.getAuthor().isEmpty();
    }

    private boolean titleNotFilledIn(Book book) {
        return book.getTitle() == null || book.getTitle().isEmpty();
    }

}
