package student_yurii_panasiuk.lesson_11.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

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

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");

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



            assertTrue(bookReaderDemo.librarysEquals(bookReaderDemo.findBooksByAutor("Herbert Schildt",library),
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



        assertTrue(bookReaderDemo.librarysEquals(bookReaderDemo.findBooksByAutorPartially("Herbert Schildt",library),
                searchResultTest));
    }
    }