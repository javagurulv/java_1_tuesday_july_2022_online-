package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

import java.util.ArrayList;
import java.util.Arrays;

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

    @Override
    public boolean markRead(Book book, boolean isRead) {
        boolean status = false;
        if (existsInReader(book)) {
            book.setRead(isRead);
            status = true;
        }
        return status;
    }

    @Override
    public String[] showBooks() {
        Book[] books = new Book[booksInReader.size()];
        booksInReader.toArray(books);
        return new String[]{Arrays.toString(books)};
    }

    @Override
    public String[] showBooksByAuthor(String author) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : booksInReader) {
            if (isAuthorFullMatch(book, author) || isAuthorSimilarTo(book, author)) {         // can wrap in one method if needed
                searchResult.add(book);
            }
        }
        Book[] booksFound = new Book[searchResult.size()];
        searchResult.toArray(booksFound);
        return new String[]{Arrays.toString(booksFound)};
    }

    @Override
    public String[] showBooksByTitle(String title) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : booksInReader) {
            if (isTitleFullMatch(book, title) || isTitleSimilarTo(book, title)) {
                searchResult.add(book);
            }
        }
        Book[] booksFound = new Book[searchResult.size()];
        searchResult.toArray(booksFound);
        return new String[]{Arrays.toString(booksFound)};
    }

    @Override
    public String[] showReadBooks() {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : booksInReader) {
            if (book.getRead()) {
                searchResult.add(book);
            }
        }
        Book[] booksFound = new Book[searchResult.size()];
        searchResult.toArray(booksFound);
        return new String[]{Arrays.toString(booksFound)};
    }

    private boolean isAuthorFullMatch(Book book, String author) {                           // can make both methods || if needed
        return book.getAuthor().equals(author);
    }

    private boolean isAuthorSimilarTo(Book book, String authorPartly) {
        return book.getAuthor().startsWith(authorPartly);
    }

    private boolean isTitleFullMatch(Book book, String title) {
        return book.getTitle().equals(title);
    }

    private boolean isTitleSimilarTo(Book book, String titlePartly) {
        return book.getTitle().startsWith(titlePartly);
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
