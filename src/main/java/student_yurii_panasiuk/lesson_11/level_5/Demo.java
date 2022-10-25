package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;
import java.util.List;

public class Demo {


    public static void main(String[] args) {

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

        Book book4 = new Book();
        book4.setBookAutor("Herbert Schildt");
        //  book4.setBookTitle("Java");

        Book book5 = new Book();
        //  book5.setBookAutor("Herbert Schildt");
        book5.setBookTitle("Java");



        BookList library = new BookList();

        BookReaderImpl bookReaderDemo = new BookReaderImpl();



        System.out.println(bookReaderDemo.bookAdd(book1,library));
        System.out.println(bookReaderDemo.bookAdd(book2,library));
        System.out.println(bookReaderDemo.bookAdd(book3,library));
        System.out.println(bookReaderDemo.bookAdd(book1,library));
        System.out.println(bookReaderDemo.bookAdd(book4,library));
        System.out.println(bookReaderDemo.bookAdd(book5,library));



    }
}
