package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

import java.util.Arrays;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class BookReaderImplTest {

    public static void main(String[] args) {
        BookReaderImplTest test = new BookReaderImplTest();

        test.shouldAddNotExisting();
        test.shouldAddSameAuthorBook();
        test.shouldAddSameTitleBook();

        test.shouldNotAddExistingTitleAndAuthor();
        test.shouldNotAddSameBook();

        test.shouldNotAddEmptyAuthor();
        test.shouldNotAddNullAuthor();
        test.shouldNotAddEmptyTitle();
        test.shouldNotAddNullTitle();
        test.shouldNotAddEmptyBoth();
        test.shouldNotAddNullBoth();
        test.shouldNotAddEmptyAuthorNullTitle();
        test.shouldNotAddNullAuthorEmptyTitle();

        test.shouldRemoveExisting();
        test.shouldNotRemoveNotExisting();

        test.shouldShowBooks();
        test.shouldFindBooksByAuthorFullMatch();
        test.shouldFindBooksByAuthorPartly();

        test.shouldFindBooksByTitleFullMatch();

    }

    void shouldAddNotExisting() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");
        Book book3 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedShouldAdd = true;
        boolean reallyShouldAdd = bookReader.addBook(book3);

        printTestResult(expectedShouldAdd == reallyShouldAdd, "Should add not existing book");
    }

    void shouldAddSameAuthorBook() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("George Orwell", "Animal Farm");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);

        boolean expectedShouldAdd = true;
        boolean reallyShouldAdd = bookReader.addBook(book2);

        printTestResult(expectedShouldAdd == reallyShouldAdd, "Should add same author book");
    }

    void shouldAddSameTitleBook() {
        Book book1 = new Book("Jill McCorkle", "Life after life");
        Book book2 = new Book("Kate Atkinson", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);

        boolean expectedShouldAdd = true;
        boolean reallyShouldAdd = bookReader.addBook(book2);

        printTestResult(expectedShouldAdd == reallyShouldAdd, "Should add same title book");
    }

    void shouldNotAddExistingTitleAndAuthor() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland" );
        Book book3 = new Book("Nicholas Sparks", "Dreamland");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book3);

        printTestResult(expectedAdded == reallyAdded, "Should not add book with existing title and author");
    }

    void shouldNotAddSameBook() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book2);

        printTestResult(expectedAdded == reallyAdded, "Should not add same book");
    }

    void shouldNotAddEmptyAuthor() {
        Book book1 = new Book("", "1984");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add empty string author book");
    }

    void shouldNotAddNullAuthor() {
        Book book1 = new Book(null, "1984");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add null author book");
    }

    void shouldNotAddEmptyTitle() {
        Book book1 = new Book("George Orwell", "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add empty string title book");
    }

    void shouldNotAddNullTitle() {
        Book book1 = new Book("George Orwell", null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add null title book");
    }

    void shouldNotAddEmptyBoth() {
        Book book1 = new Book("", "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add empty string both book");
    }

    void shouldNotAddNullBoth() {
        Book book1 = new Book(null, null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add null both book");
    }

    void shouldNotAddEmptyAuthorNullTitle() {
        Book book1 = new Book("", null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add empty author null title book");
    }

    void shouldNotAddNullAuthorEmptyTitle() {
        Book book1 = new Book(null, "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedAdded = false;
        boolean reallyAdded = bookReader.addBook(book1);

        printTestResult(expectedAdded == reallyAdded, "Should not add null author empty title book");
    }

    void shouldRemoveExisting() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedRemoved = true;
        boolean reallyRemoved = bookReader.removeBook(book2);

        printTestResult(expectedRemoved == reallyRemoved, "Should remove existing book");
    }

    void shouldNotRemoveNotExisting() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");
        Book book3 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedRemoved = false;
        boolean reallyRemoved = bookReader.removeBook(book3);

        printTestResult(expectedRemoved == reallyRemoved, "Should not remove not existing book");
    }

    void shouldShowBooks() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");
        Book book3 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);

        String[] expectedBookList = {
                "[1984 [George Orwell], Dreamland [Nicholas Sparks], Fairy Tale [Stephen King]]"
        };

        String[] realBookList = bookReader.showBooksByAuthor();

        printTestResult(Arrays.equals(expectedBookList, realBookList), "Should return same book list String[]");
    }

    void shouldFindBooksByAuthorFullMatch() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("George Orwell", "1984");
        Book book3 = new Book("Nicholas Sparks", "Dreamland");
        Book book4 = new Book("George Orwell", "Animal Farm");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        String[] expectedBookList = {
                "[1984 [George Orwell], Animal Farm [George Orwell]]"
        };

        String[] realBookList = bookReader.showBooksByAuthor("George Orwell");

        printTestResult(Arrays.equals(expectedBookList, realBookList), "Should return book list by author");
    }

    void shouldFindBooksByAuthorPartly() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("George Orwell", "1984");
        Book book3 = new Book("Nicholas Sparks", "Dreamland");
        Book book4 = new Book("George Orwell", "Animal Farm");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        String[] expectedBookList = {
                "[1984 [George Orwell], Animal Farm [George Orwell]]"
        };

        String[] realBookList = bookReader.showBooksByAuthor("Ge");

        printTestResult(Arrays.equals(expectedBookList, realBookList), "Should return book list by author partial input");
    }

    void shouldFindBooksByTitleFullMatch() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("Jill McCorkle", "Life after life");
        Book book3 = new Book("George Orwell", "1984");
        Book book4 = new Book("Kate Atkinson", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        String[] expectedBookList = {
                "[Life after life [Jill McCorkle], Life after life [Kate Atkinson]]"
        };

        String[] realBookList = bookReader.showBooksByTitle("Life after life");

        printTestResult(Arrays.equals(expectedBookList, realBookList), "Should return book list by title full match");
    }

}
