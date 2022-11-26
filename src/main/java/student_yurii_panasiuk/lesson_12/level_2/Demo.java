package student_yurii_panasiuk.lesson_12.level_2;

public class Demo {
    public static void main(String[] args) {

        BookDatabaseImpl bookDatabaseImplDemo = new BookDatabaseImpl();
        Book book1 = new Book("Tolkien", "The Fellowship of the Ring");
        Book book2 = new Book("Tolkien", "The Two Towers");
        Book book3 = new Book("Tolkien", "The Return of the King");

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
    }
}
