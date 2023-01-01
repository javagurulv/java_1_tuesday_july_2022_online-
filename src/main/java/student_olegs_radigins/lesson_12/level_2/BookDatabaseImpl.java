package student_olegs_radigins.lesson_12.level_2;

import java.util.*;
import java.util.stream.Stream;

class BookDatabaseImpl implements BookDatabase {
    List<Book> books = new ArrayList<>();
    Long bookNewId = 0L;

    @Override
    public Long save(Book book) {
        bookNewId++;
        book.setId(bookNewId);
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
        for (Book book1 : books) {
            if(book1.equals(book)){
               return books.remove(book);
            }
        }
        return false;
    }

    @Override
    public Optional<Book> findById(Long bookId) {
        for (Book book : books) {
            if (book.getId().equals(bookId)){
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;

    }

    @Override
    public List<Book> findByTitle(String title) {
        List<Book> booksByTitle = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                booksByTitle.add(book);
            }
        }
        return booksByTitle;
    }

    @Override
    public int countAllBooks() {
        return books.size();
    }

    @Override
    public void deleteByAuthor(String author) {
        books.removeAll(findByAuthor(author));
    }

    @Override
    public void deleteByTitle(String title) {
        books.removeAll(findByTitle(title));
    }

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> booksWithSearchCriteria = new ArrayList<>();
        for (Book book : books){
           if (searchCriteria.match(book)){
               booksWithSearchCriteria.add(book);
           }
        }
        return booksWithSearchCriteria;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> authors = new HashSet<>();
        for (Book book : books){
            authors.add(book.getAuthor());
        }
        return authors;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> titles = new HashSet<>();
        for (Book book : books){
            titles.add(book.getTitle());
        }
        return titles;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        Set<Book> uniqueBooks = new HashSet<>();
        for( Book book : books){
            uniqueBooks.add(book);
        }
        return uniqueBooks;
    }
}
