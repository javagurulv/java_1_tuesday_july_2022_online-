package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI.*;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImplDemo = new BookDatabaseImpl();
        Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
        Book book2 = new Book("Tolkien", "The Two Towers");
        Book book3 = new Book("Tolkien", "The Return of the King");
        Book book4 = new Book("Isaac Asimov", "Foundation");

        System.out.println(bookDatabaseImplDemo.save(book1));
        System.out.println(bookDatabaseImplDemo.save(book2));
        System.out.println(bookDatabaseImplDemo.save(book3));

        System.out.println(bookDatabaseImplDemo.delete(1L));
        System.out.println(bookDatabaseImplDemo.delete(2L));
        System.out.println(bookDatabaseImplDemo.delete(book3));
        System.out.println(bookDatabaseImplDemo.delete(1L));
        System.out.println(bookDatabaseImplDemo.delete(book2));

        System.out.println(bookDatabaseImplDemo.save(book1));
        System.out.println(bookDatabaseImplDemo.save(book2));
        System.out.println(bookDatabaseImplDemo.save(book3));

        System.out.println(bookDatabaseImplDemo.findById(1L).get().toString());
        System.out.println(bookDatabaseImplDemo.findById(4L));

        System.out.println(bookDatabaseImplDemo.findByAuthor("Tolkien"));

        System.out.println(bookDatabaseImplDemo.findByTitle("The Two Towers"));

        System.out.println(bookDatabaseImplDemo.countAllBooks());

        System.out.println(bookDatabaseImplDemo.toString());
        System.out.println(bookDatabaseImplDemo.save(book4));
        System.out.println(bookDatabaseImplDemo.save(book4)); // it is possible to add duplicate
        System.out.println(bookDatabaseImplDemo.toString());
        bookDatabaseImplDemo.deleteByAuthor("Isaac Asimov");
        System.out.println(bookDatabaseImplDemo.toString());
        bookDatabaseImplDemo.deleteByAuthor("Tolkien");
        System.out.println(bookDatabaseImplDemo.toString());

        System.out.println(bookDatabaseImplDemo.save(book1));
        System.out.println(bookDatabaseImplDemo.save(book2));
        System.out.println(bookDatabaseImplDemo.save(book3));
        System.out.println(bookDatabaseImplDemo.save(book4));
        System.out.println(bookDatabaseImplDemo.toString());
        AndSearchCriteria andSearchCriteriaDemo = new AndSearchCriteria(
                book -> {return book.getAuthor().equals("Isaac Asimov");},
                book -> {return book.getTitle().equals("Foundation");}
                );
        System.out.println(andSearchCriteriaDemo.match(book4));

        OrSearchCriteria orSearchCriteriaDemo = new OrSearchCriteria(
                book -> {return book.getAuthor().equals("Isaac Asimov");},
                book -> {return book.getTitle().equals("The Fellowship of the Ring");}
        );
        System.out.println(orSearchCriteriaDemo.match(book4));
        System.out.println(orSearchCriteriaDemo.match(book1));
        System.out.println(orSearchCriteriaDemo.match(book2));
        System.out.println();

        SearchCriteria authorSearchCriteria = new AuthorSearchCriteria("Isaac Asimov");
        SearchCriteria titleSearchCriteria = new TitleSearchCriteria("The Fellowship of the Ring");
        SearchCriteria searchCriteria = new OrSearchCriteria(authorSearchCriteria, titleSearchCriteria);

        System.out.println(searchCriteria.match(book4));
        System.out.println(searchCriteria.match(book1));
        System.out.println(searchCriteria.match(book2));
        System.out.println();

        System.out.println(bookDatabaseImplDemo.find(searchCriteria));
        System.out.println();

        System.out.println(bookDatabaseImplDemo.findUniqueAuthors());
        System.out.println(bookDatabaseImplDemo.findUniqueAuthors().size());

        /*

        System.out.println(bookDatabaseImplDemo.toString());
        SaveBookUIAction saveBookUIDemo = new SaveBookUIAction(bookDatabaseImplDemo);
        saveBookUIDemo.execute();
        System.out.println(bookDatabaseImplDemo.toString());

        FindByIdUIAction findByIdUIDemo = new FindByIdUIAction(bookDatabaseImplDemo);
        findByIdUIDemo.execute();

        FindByAuthorUIAction findByAuthorUIDemo = new FindByAuthorUIAction(bookDatabaseImplDemo);
        findByAuthorUIDemo.execute();

        System.out.println(bookDatabaseImplDemo.toString());
        FindByTitleUIAction findByTitleUIDemo = new FindByTitleUIAction(bookDatabaseImplDemo);
        findByTitleUIDemo.execute();

        System.out.println(bookDatabaseImplDemo.toString());
        DeleteByIdUIAction deleteByIdUIDemo = new DeleteByIdUIAction(bookDatabaseImplDemo);
        deleteByIdUIDemo.execute();
        System.out.println(bookDatabaseImplDemo.toString());

        */

        System.out.println(bookDatabaseImplDemo.toString());
        System.out.println("paging");
        ArrayList<Book> booksToPrint = new ArrayList<>();
        booksToPrint.addAll(bookDatabaseImplDemo.findByAuthor("Tolkien"));
        Paging showPage = new Paging(booksToPrint);
       //Paging showPage = new Paging(bookDatabaseImplDemo.getBookArrayList());
        System.out.println(booksToPrint);

       for (Book book : showPage.getPage(1)){ System.out.println(book); }
       for (Book book : showPage.getPage(2)){ System.out.println(book); }

    }


}
