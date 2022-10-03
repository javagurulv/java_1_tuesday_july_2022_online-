package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

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

        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book3);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add book with existing title and author");
    }

    void shouldNotAddSameBook() {
        Book book1 = new Book("George Orwell", "1984");
        Book book2 = new Book("Nicholas Sparks", "Dreamland");

        BookReaderImpl bookReader = new BookReaderImpl();
        bookReader.addBook(book1);
        bookReader.addBook(book2);

        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book2);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add same book");
    }

    void shouldNotAddEmptyAuthor() {
        Book book1 = new Book("", "1984");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add empty string author book");
    }

    void shouldNotAddNullAuthor() {
        Book book1 = new Book(null, "1984");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add null author book");
    }

    void shouldNotAddEmptyTitle() {
        Book book1 = new Book("George Orwell", "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add empty string title book");
    }

    void shouldNotAddNullTitle() {
        Book book1 = new Book("George Orwell", null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add null title book");
    }

    void shouldNotAddEmptyBoth() {
        Book book1 = new Book("", "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add empty string both book");
    }

    void shouldNotAddNullBoth() {
        Book book1 = new Book(null, null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add null both book");
    }

    void shouldNotAddEmptyAuthorNullTitle() {
        Book book1 = new Book("", null);

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add empty author null title book");
    }

    void shouldNotAddNullAuthorEmptyTitle() {
        Book book1 = new Book(null, "");

        BookReaderImpl bookReader = new BookReaderImpl();
        boolean expectedShouldNotAdd = false;
        boolean reallyShouldNotAdd = bookReader.addBook(book1);

        printTestResult(expectedShouldNotAdd == reallyShouldNotAdd, "Should not add null author empty title book");
    }

}
