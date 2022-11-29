package student_yurii_panasiuk.lesson_12.level_2_3;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookDatabaseImplTest extends TestCase {

    BookDatabaseImpl bookDatabaseImplTest = new BookDatabaseImpl();
    Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
    Book book2 = new Book("Tolkien", "The Two Towers");
    Book book3 = new Book("Tolkien", "The Return of the King");
    Book book4 = new Book("Isaac Asimov", "Foundation");
    Book book5 = new Book("Asimov", "Foundation");

    public void testSave() {
        assertTrue(bookDatabaseImplTest.save(book1) == 1L);
        assertTrue(bookDatabaseImplTest.save(book2) == 2L);
        assertTrue(bookDatabaseImplTest.save(book3) == 3L);
    }

    public void testDeleteByID() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        assertTrue(bookDatabaseImplTest.delete(1L));
        assertTrue(bookDatabaseImplTest.delete(2L));
        assertFalse(bookDatabaseImplTest.delete(3L));
        }

    public void testDeleteByBook() {
        bookDatabaseImplTest.save(book1);
        assertTrue(bookDatabaseImplTest.delete(book1));
        assertFalse(bookDatabaseImplTest.delete(book1));
    }

    public void testFindById() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);

        assertEquals(bookDatabaseImplTest.findById(1L), Optional.of(book1));
        assertEquals(bookDatabaseImplTest.findById(2L), Optional.of(book2));
        assertNotSame(bookDatabaseImplTest.findById(3L), Optional.of(book1));
        assertEquals(bookDatabaseImplTest.findById(4L), Optional.empty());
    }

    public void testFindByAuthor() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);
        bookDatabaseImplTest.save(book4);

        List<Book> testtList = new ArrayList<Book>();
        testtList.add(book1);
        testtList.add(book2);
        testtList.add(book3);

        assertEquals(bookDatabaseImplTest.findByAuthor("Tolkien"), testtList);
    }
    public void testfindByTitle() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);
        bookDatabaseImplTest.save(book4);
        bookDatabaseImplTest.save(book5);

        List<Book> testtList = new ArrayList<Book>();
        testtList.add(book4);
        testtList.add(book5);

        assertEquals(bookDatabaseImplTest.findByTitle("Foundation"), testtList);
    }

    public void testcountAllBooks() {

        assertEquals(bookDatabaseImplTest.countAllBooks(), 0);

        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);
        bookDatabaseImplTest.save(book4);
        bookDatabaseImplTest.save(book5);


        assertEquals(bookDatabaseImplTest.countAllBooks(), 5);
    }

    public void testdeleteByAuthor() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);
        bookDatabaseImplTest.save(book4);

        List<Book> testtList1 = new ArrayList<Book>();
        testtList1.add(book1);
        testtList1.add(book2);
        testtList1.add(book3);

        bookDatabaseImplTest.deleteByAuthor("Isaac Asimov");
        assertEquals(bookDatabaseImplTest.bookArrayList, testtList1);
        bookDatabaseImplTest.deleteByAuthor("Tolkien");
        assertTrue(bookDatabaseImplTest.countAllBooks() == 0);

    }

    public void testdeleteByTitle() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book3);
        bookDatabaseImplTest.save(book4);

        List<Book> testtList1 = new ArrayList<Book>();
        testtList1.add(book1);
        testtList1.add(book2);
        testtList1.add(book3);
        testtList1.add(book4);
        testtList1.remove(0);

        List<Book> testtList2 = new ArrayList<Book>();
        testtList2.add(book1);
        testtList2.add(book2);
        testtList2.add(book3);
        testtList2.add(book4);
        testtList2.remove(0);
        testtList2.remove(2);

        bookDatabaseImplTest.deleteByTitle("The Fellowship of the Ring");
        assertEquals(bookDatabaseImplTest.bookArrayList, testtList1);
        bookDatabaseImplTest.deleteByTitle("Foundation");
        assertEquals(bookDatabaseImplTest.bookArrayList, testtList2);

    }

    public void testfind() {
        bookDatabaseImplTest.save(book1);
        bookDatabaseImplTest.save(book2);
        bookDatabaseImplTest.save(book4);

        List<Book> testtList1 = new ArrayList<Book>();
        testtList1.add(book1);
        testtList1.add(book4);

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Isaac Asimov");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Fellowship of the Ring");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        assertEquals(testtList1, bookDatabaseImplTest.find(searchCriteria));
    }


}