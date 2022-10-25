package student_yurii_panasiuk.lesson_11.level_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookReaderImplTest {

    @Test
    public void bookAdd() {

        Book book0 = new Book();
        book0.setBookAutor("Herbert Schildt");
        book0.setBookTitle("Java");

        Book book1 = new Book();
        book1.setBookAutor("Tolkien");
        book1.setBookTitle("The Fellowship of the Ring");

        Book book2 = new Book();
        book2.setBookAutor("Tolkien");
        book2.setBookTitle("The Two Towers");

        Book book3 = new Book();
        book3.setBookAutor("Tolkien");
        book3.setBookTitle("The Return of the King");



        BookList library = new BookList();

        BookReaderImpl bookReaderDemo = new BookReaderImpl();

       assertTrue( bookReaderDemo.bookAdd(book1,library) );
       assertTrue( bookReaderDemo.bookAdd(book2,library) );
       assertFalse( bookReaderDemo.bookAdd(book1,library) );

    }
}