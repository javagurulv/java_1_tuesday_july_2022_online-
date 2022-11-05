package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_junior.task_6_x;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    List<Book> books = new ArrayList<>();
    private Long lastId = 0L;

    @Override
    public Long save(Book book) {
        lastId++;
        book.setId(lastId);
        books.add(book);
        return book.getId();
    }

    @Override
    public boolean delete(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return books.remove(book);
            }
        }
        return false;
    }

    @Override
    public boolean delete(Book book) {
        for (Book bookInList : books) {
            if (bookInList.equals(book)) {      // this way doesn't throw NullPointerException
                return books.remove(bookInList);
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksToDelete.add(book);
            }
        }
        books.removeAll(booksToDelete);
    }

    @Override
    public void deleteByTitle(String title) {
        List<Book> booksToDelete = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                booksToDelete.add(book);
            }
        }
        books.removeAll(booksToDelete);
    }

}
