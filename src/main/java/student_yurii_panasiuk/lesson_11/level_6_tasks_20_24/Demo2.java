package student_yurii_panasiuk.lesson_11.level_6_tasks_20_24;

public class Demo2 {

    public static void main(String[] args) {
    // создание примера книг
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
    //  book4.setBookTitle("Java"); //книги без названия "невозможно" добавить в библиотеку
    Book book5 = new Book();
    //  book5.setBookAutor("Herbert Schildt"); //книги без автора "невозможно" добавить в библиотеку
        book5.setBookTitle("Java");

        BookList library = new BookList(); // создаем библиотеку
        BookReaderImpl bookReaderDemo = new BookReaderImpl(); // экземпляр класса с функционалом библиотеки

        bookReaderDemo.bookAdd(book0,library); //добавляем книги, учитывая заданные правила (по умолчанию "непрочитанная")
        bookReaderDemo.bookAdd(book1,library);
        bookReaderDemo.bookAdd(book2,library);
        bookReaderDemo.bookAdd(book3,library);
        bookReaderDemo.bookAdd(book4,library); // книга без названия не добавится
        bookReaderDemo.bookAdd(book5,library); // книга без автора не добавится
        bookReaderDemo.bookAdd(book1,library); // книга с одинаковым автором и названием не добавится

        bookReaderDemo.libraryToConsole(library); // вывод книг
                System.out.println();
        // поиск по автору и вывод в расширенной форме
        bookReaderDemo.libraryToConsole(bookReaderDemo.findBooksByAutor("Herbert Schildt", library));
        // поиск с указанием неполного имени автора
        bookReaderDemo.libraryToConsole(bookReaderDemo.findBooksByAutorPartially("Herbert", library));
        // поиск по названию
        bookReaderDemo.libraryToConsole( (bookReaderDemo.findBooksByTitle("Java", library)) );
        // поиск с указанием начала! названия
        bookReaderDemo.libraryToConsole( (bookReaderDemo.findBooksByTitlePartially("Jav", library))  );
                System.out.println();
        bookReaderDemo.bookDel(book3,library); // удаление книги

        bookReaderDemo.libraryToConsole(library); // вывод книг

        bookReaderDemo.getBook(1, library).setReadStatus(); // установка статуса "прочитанная" первой добавленной книге
        bookReaderDemo.getBook(2, library).setReadStatus(); // установка статуса "прочитанная" второй добавленной книге
        bookReaderDemo.getBook(3, library).setUnreadStatus(); // установка статуса "непрочитанная" третьей добавленной книге
                System.out.println();
        bookReaderDemo.libraryToConsole(library); // вывод книг
                System.out.println();
        // упрощенный вывод "прочитанных" книг
        bookReaderDemo.libraryToConsoleSimple( bookReaderDemo.findBooksRead(library) );
                System.out.println();
        // упрощенный вывод "непрочитанных" книг
        bookReaderDemo.libraryToConsoleSimple( bookReaderDemo.findBooksUnread(library) );
    }
}