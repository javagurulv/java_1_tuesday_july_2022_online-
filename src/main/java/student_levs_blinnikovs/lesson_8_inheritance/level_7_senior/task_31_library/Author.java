package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

import java.util.List;

class Author extends Person {

    List<Book> booksPublished;

    Author(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String getAuthorFirstName() {          // maybe better override toString() method from lecture example
        return this.firstName;
    }

    public String getAuthorLastName() {
        return this.lastName;
    }

    public void addBooksPublished(List<Book> booksPublished) {
        this.booksPublished = booksPublished;
    }

}
