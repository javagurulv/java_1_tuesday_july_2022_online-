package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.ArrayList;
import java.util.List;

class LibraryDemo {

    public static void main(String[] args) {

        Book book1 = new Book("The sun also rises", "Ernest Hemingway", 1926);
        Book book2 = new Book("Vile Bodies", "Evelyn Waugh", 1930);
        Book book3 = new Book("Number the stars", "Lois Lowry", 1989);
        Book book4 = new Book("Brave new World", "Aldous Huxley", 1932);

        ArrayList<Book> list = new ArrayList<>();

        BookDatabase bookDatabase = new BookDatabase();

        bookDatabase.addBook(book1);
        bookDatabase.addBook(book2);
        bookDatabase.addBook(book3);
        bookDatabase.addBook(book4);

        bookDatabase.getBook(1);
        bookDatabase.getBook(2);
        bookDatabase.getBook(3);
        Book savedBook = bookDatabase.getBook(4);
        System.out.println("Book id " + savedBook.getId() + " is \"" + savedBook.getTitle() + "\" written by " +
                savedBook.getAuthor() + " in " + savedBook.getPublicationYear() + ". ");

    }

}
