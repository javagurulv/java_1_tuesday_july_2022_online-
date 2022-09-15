package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.ArrayList;

class BookDatabase {

    ArrayList<Book> books = new ArrayList<>();  // better in explicit constructor?

    void addBook(Book book) {
        books.add(book);
    }

    Book getBookById(int id) {          //not fully satisfied how this is done. Maybe better with Map (id, Book).. to avoid loop. Or maybe using something other than loop for getBook(int id);
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    Book getBookByAuthor(Author author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }

    Book getBookByPublicationYear(int year) {
        for (Book book : books) {
            if (book.getPublicationYear() == year) {
                return book;
            }
        }
        return null;
    }


//    not in the requirements
    void deleteBook(int id) {
        books.remove(getBookById(id));
    }

//    not in the requirements
//    void updateBook(int id, String title, String author, int publicationYear) {
//        Book bookToUpdate = getBook(id);
//        bookToUpdate.setTitle(title);
//        bookToUpdate.setAuthor(author);
//        bookToUpdate.setPublicationYear(publicationYear);
//    }

}
