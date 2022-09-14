package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.ArrayList;

class BookDatabase {

    ArrayList<Book> books;

    BookDatabase() {

    }

//    this can be used to initialize some pre-defined library
//    public void setBooks(ArrayList<Book> books) {
//        this.books = books;
//    }

    void addBook(Book book) {
        books.add(book);
    }

    Book getBook(int id) {          //not satisfied how this is done. Maybe better with Map (id, Book).. to avoid loop. Or maybe using something other than loop for getBook(int id);
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

//    not in the requirements
//    void deleteBook(int id) {
//        books.remove(getBook(id));
//    }

//    not in the requirements
//    void updateBook(int id, String title, String author, int publicationYear) {
//        Book bookToUpdate = getBook(id);
//        bookToUpdate.setTitle(title);
//        bookToUpdate.setAuthor(author);
//        bookToUpdate.setPublicationYear(publicationYear);
//    }


}
