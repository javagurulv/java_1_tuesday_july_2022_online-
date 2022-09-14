package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

abstract class LibraryService {

    private boolean isTaken(Book book) {
        return book.getTakenBy() != null;
    }

    private boolean isReserved(Book book) {
        return book.getReservedBy() != null;
    }

    private boolean isReserved(Book book, User user) {
        return book.getReservedBy().equals(user);
    }

    void takeBook(Book book, User user) {
        if (!isTaken(book) && (!isReserved(book) || isReserved(book, user))) {
            book.setReservedBy(null);
            book.setTakenBy(user);
        } else {
            System.out.println("Can't take book which is already taken or not reserved by this user!");
        }
    }

    void returnBook(Book book) {           // here I could introduce more like... only specific user to whom book is assigned can return.. but usually you can return anyone's book. would be additional param. It is Library API internal method, rather than User API
        if (isTaken(book)) {
            book.setTakenBy(null);                                  // maybe with 'Library' type user instead to avoid using null?
        } else {
            System.out.println("Can't return not taken book!");
        }
    }

    abstract void findBook(Book book);

    void reserveBook(Book book, User user) {
        if (!isTaken(book) && !isReserved(book)) {
            book.setReservedBy(user);
        } else {
            System.out.println("Can't reserve as book is already reserved or taken!");
        }

    }

    void unReserveBook(Book book) {                     // here again, depends on who is performing operation args count can be increased.. is it internal Library API or User API...
        if (!isTaken(book) && isReserved(book)) {
            book.setReservedBy(null);
        } else {
            System.out.println("Can't cancel reservation as book is not reserved or is taken!");
        }
    }

    UserNotification notifyUserAboutReturnTerm(User user, Book book) {
        return new UserNotification("Return term due!", user, book);
    }

    UserNotification[] notifyUserAboutReturnTerm(User[] users) {
        // logic about iterating over user collection, get their overdue books and produce notifications
        return new UserNotification[users.length];
    }

    Penalty assignPenalty(User user, Book book) {
        return new Penalty(1, user, book);
    }

    void addNewBook(Book book, BookDatabase bookDatabase) {
        bookDatabase.addBook(book);
    }

}
