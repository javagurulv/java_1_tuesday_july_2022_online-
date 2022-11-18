package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_middle.task_6_x;

import java.util.*;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
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

    @Override
    public List<Book> find(SearchCriteria searchCriteria) {
        List<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (searchCriteria.match(book)) {
                searchResult.add(book);
            }
        }
        return searchResult;
    }

    @Override
    public Set<String> findUniqueAuthors() {
        Set<String> searchResult = new HashSet<>();
        for (Book book : books) {
            searchResult.add(book.getAuthor());
        }
        return searchResult;
    }

    @Override
    public Set<String> findUniqueTitles() {
        Set<String> searchResult = new HashSet<>();
        for (Book book : books) {
            searchResult.add(book.getTitle());
        }
        return searchResult;
    }

    @Override
    public Set<Book> findUniqueBooks() {
        return new HashSet<>(books);
    }

    @Override
    public boolean contains(Book book) {
        return books.contains(book);
    }

    @Override
    public Map<String, List<Book>> getAuthorToBooksMap() {
        Map<String, List<Book>> authorToBooksMap = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();                // TODO need to remove unique authors criteria because Map is always with unique keys
        Set<Book> uniqueBooks = findUniqueBooks();
        for (Book uniqueBook : uniqueBooks) {
            for (String uniqueAuthor : uniqueAuthors) {
                if (uniqueBook.getAuthor().equals(uniqueAuthor)) {
                    authorToBooksMap.put(uniqueAuthor, findByAuthor(uniqueAuthor));
                }
            }
        }
        return authorToBooksMap;
    }

    @Override
    public Map<String, Integer> getEachAuthorBookCount() {
        Map<String, Integer> authorToBooksMap = new HashMap<>();
        Set<String> uniqueAuthors = findUniqueAuthors();
        Set<Book> uniqueBooks = findUniqueBooks();
        for (Book uniqueBook : uniqueBooks) {
            for (String uniqueAuthor : uniqueAuthors) {
                if (uniqueBook.getAuthor().equals(uniqueAuthor)) {
                    Integer bookCount = findByAuthor(uniqueAuthor).size();
                    authorToBooksMap.put(uniqueAuthor, bookCount);
                }
            }
        }
        return authorToBooksMap;
    }

}
