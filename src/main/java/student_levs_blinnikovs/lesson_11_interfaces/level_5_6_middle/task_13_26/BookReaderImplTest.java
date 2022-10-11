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
        test.shouldFindBooksByTitlePartly();

        test.shouldNotBeReadByDefault();

        test.shouldMarkRead();
        test.shouldNotMarkReadNotExistingBook();

        test.shouldMarkNotRead();
        test.shouldNotMarkNotReadNotExistingBook();

        test.shouldFindReadBooks();
        test.shouldNotReturnNotReadBooks();

        test.shouldFindDefaultNotReadBooks();
        test.shouldNotReturnReadBooks();
        test.shouldReturnUnReadBooks();

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

        String[] realBookList = bookReader.showBooks();

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

    void shouldFindBooksByTitlePartly() {
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

        String[] realBookList = bookReader.showBooksByTitle("L");

        printTestResult(Arrays.equals(expectedBookList, realBookList), "Should return book list by title partial input");
    }

    void shouldNotBeReadByDefault() {
        Book book1 = new Book("Stephen King", "Fairy Tale");

        boolean expectedIsRead = false;
        boolean realIsRead = book1.getRead();

        printTestResult(expectedIsRead == realIsRead, "Should not be read by default");
    }

    void shouldMarkRead() {
        Book book1 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);

        boolean expectedReadOperationCompleted = true;
        boolean realIsReadOperationCompleted = bookReader.markRead(book1, true);

        boolean expectedIsRead = true;
        boolean realIsRead = book1.getRead();

        printTestResult((expectedReadOperationCompleted == realIsReadOperationCompleted) &&
                (expectedIsRead == realIsRead), "Should mark existing book read and return correct operation status");
    }

    void shouldNotMarkReadNotExistingBook() {
        Book book1 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();

        boolean expectedReadOperationCompleted = false;
        boolean realIsReadOperationCompleted = bookReader.markRead(book1, true);

        boolean expectedIsRead = false;
        boolean realIsRead = book1.getRead();

        printTestResult((expectedReadOperationCompleted == realIsReadOperationCompleted) &&
                (expectedIsRead == realIsRead), "Should not mark read book which is not in the reader and return correct operation status");
    }

    void shouldMarkNotRead() {
        Book book1 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.markRead(book1, true);

        boolean expectedIsNotReadOperationCompleted = true;
        boolean realIsNotReadOperationCompleted = bookReader.markRead(book1, false);

        boolean expectedIsRead = false;
        boolean realIsRead = book1.getRead();

        printTestResult((expectedIsNotReadOperationCompleted == realIsNotReadOperationCompleted) &&
                (expectedIsRead == realIsRead), "Should mark existing book not read and return correct operation status");
    }

    void shouldNotMarkNotReadNotExistingBook() {
        Book book1 = new Book("Stephen King", "Fairy Tale");

        BookReaderImpl bookReader = new BookReaderImpl();

        boolean expectedIsNotReadOperationCompleted = false;
        boolean realIsNotReadOperationCompleted = bookReader.markRead(book1, false);

        boolean expectedIsRead = false;
        boolean realIsRead = book1.getRead();

        printTestResult((expectedIsNotReadOperationCompleted == realIsNotReadOperationCompleted) &&
                (expectedIsRead == realIsRead), "Should not mark not read book which is not in the reader and return correct operation status");
    }

    void shouldFindReadBooks() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("Jill McCorkle", "Life after life");
        Book book3 = new Book("George Orwell", "1984");
        Book book4 = new Book("Kate Atkinson", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        String[] expectedReadBookList = {"[Life after life [Jill McCorkle], 1984 [George Orwell]]"};

        bookReader.markRead(book2, true);
        bookReader.markRead(book3, true);

        String[] realReadBookList = bookReader.showReadBooks();

        printTestResult(Arrays.equals(expectedReadBookList, realReadBookList), "Should return read books");
    }

    void shouldNotReturnNotReadBooks() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("Jill McCorkle", "Life after life");
        Book book3 = new Book("George Orwell", "1984");
        Book book4 = new Book("Kate Atkinson", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);
        bookReader.addBook(book3);
        bookReader.addBook(book4);

        String[] expectedReadBookList = {"[]"};

        String[] realReadBookList = bookReader.showReadBooks();

        printTestResult(Arrays.equals(expectedReadBookList, realReadBookList), "Should not return not read books");
    }

    void shouldFindDefaultNotReadBooks() {
        Book book1 = new Book("Jill McCorkle", "Life after life");
        Book book2 = new Book("George Orwell", "1984");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        String[] expectedNotReadBookList = {"[Life after life [Jill McCorkle], 1984 [George Orwell]]"};

        String[] realNotReadBookList = bookReader.showNotReadBooks();

        printTestResult(Arrays.equals(expectedNotReadBookList, realNotReadBookList), "Should return default not read books");
    }

    void shouldNotReturnReadBooks() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("Jill McCorkle", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        bookReader.markRead(book1, true);
        bookReader.markRead(book2, true);

        String[] expectedReadBookList = {"[]"};

        String[] realReadBookList = bookReader.showNotReadBooks();

        printTestResult(Arrays.equals(expectedReadBookList, realReadBookList), "Should not return read books");
    }

    void shouldReturnUnReadBooks() {
        Book book1 = new Book("Stephen King", "Fairy Tale");
        Book book2 = new Book("Jill McCorkle", "Life after life");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        bookReader.markRead(book1, true);
        bookReader.markRead(book2, true);

        bookReader.markRead(book1, false);

        String[] expectedReadBookList = {"[Fairy Tale [Stephen King]]"};

        String[] realReadBookList = bookReader.showNotReadBooks();

        printTestResult(Arrays.equals(expectedReadBookList, realReadBookList), "Should return unread books");
    }

}
