package student_yurii_panasiuk.lesson_11.level_6_tasks_20_24;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class BookReaderImplTest {

    BookList library = new BookList();
    BookReaderImpl bookReaderDemo = new BookReaderImpl();

    @Test
    public void bookAdd() {

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        //  book4.setBookTitle("Java");

        Book book5 = new Book();
        //  book5.setBookAutor("Herbert Schildt");
        book5.setBookTitle("Java");

        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        assertTrue( bookReaderDemo.bookAdd(book1,library) );
        assertTrue( bookReaderDemo.bookAdd(book2,library) );
        assertFalse( bookReaderDemo.bookAdd(book2,library) );
        assertFalse( bookReaderDemo.bookAdd(book1,library) );
        assertFalse( bookReaderDemo.bookAdd(book4,library) );
        assertFalse( bookReaderDemo.bookAdd(book5,library) );
    }

    @Test
    public void bookDel() {

        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );

        assertTrue( bookReaderDemo.bookDel(book1,library) );
        assertFalse( bookReaderDemo.bookDel(book1,library) );
        assertFalse( bookReaderDemo.bookDel(book3,library) );
    }

    @Test
    public void findBooksByAuthor() {

        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        BookList searchResultTest = new BookList();
        BookList searchResultTest2 = new BookList();

        searchResultTest.addBook(book4);
        searchResultTest2.addBook(book4);

        assertTrue(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksByAutor("Herbert Schildt",library),
                searchResultTest));
    }

    @Test
    public void findBooksByAutorPartially() {

        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        BookList searchResultTest = new BookList();
        BookList searchResultTest2 = new BookList();

        searchResultTest.addBook(book4);
        searchResultTest2.addBook(book4);

        assertTrue(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksByAutorPartially("Herbert Schildt",library),
                searchResultTest));
    }

    @Test
    public void findBooksByTitle() {
        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        BookList searchResultTest = new BookList();
        BookList searchResultTest2 = new BookList();

        searchResultTest.addBook(book4);
        searchResultTest2.addBook(book4);

        assertTrue(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksByTitle("Java",library),
                searchResultTest));
    }

    @Test
    public void findBooksByTitlePartially() {
        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );


        BookList searchResultTest = new BookList();
        BookList searchResultTest2 = new BookList();

        searchResultTest.addBook(book4);
        searchResultTest2.addBook(book4);

        assertTrue(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksByTitlePartially("Jav",library),
                searchResultTest));
    }

    @Test
    public void setReadStatus() {
        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        assertTrue(bookReaderDemo.setReadStatus(1,library)); // 2 раза можно статус поставить ))
        assertTrue(bookReaderDemo.setReadStatus(2,library));
        assertFalse(bookReaderDemo.setReadStatus(5,library));
    }

    @Test
    public void setUnreadStatus() {
        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        assertTrue(bookReaderDemo.setUnreadStatus(1,library)); // 2 раза можно статус непрочтенная поставить ))
        assertTrue(bookReaderDemo.setUnreadStatus(2,library));
        assertFalse(bookReaderDemo.setUnreadStatus(5,library));
    }

    @Test
    public void booksReadToConsole() {
        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        book4.setBookTitle("Java");

        bookReaderDemo.bookAdd( book1,library );
        bookReaderDemo.bookAdd( book2,library );
        bookReaderDemo.bookAdd( book3,library );
        bookReaderDemo.bookAdd( book4,library );

        bookReaderDemo.getBook(1, library).setReadStatus();
        bookReaderDemo.getBook(2, library).setReadStatus();

        BookList searchResultTest = new BookList();
        BookList searchResultTest2 = new BookList();

        searchResultTest.addBook(book1);
        searchResultTest.addBook(book2);
        searchResultTest2.addBook(book1);
        searchResultTest2.addBook(book3);

        assertTrue(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksRead(library),
                searchResultTest));
        assertFalse(bookReaderDemo.librariesEquals(bookReaderDemo.findBooksRead(library),
                searchResultTest2));
    }
}