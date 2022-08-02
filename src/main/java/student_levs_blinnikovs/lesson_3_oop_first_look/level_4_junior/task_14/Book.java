package student_levs_blinnikovs.lesson_3_oop_first_look.level_4_junior.task_14;

/*
Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Book.
 */

class Book {

    String title; // missing ;

    Book(String bookTitle) {
        this.title = bookTitle; // here missing ; and name of argument was wrong
    }

    String getTitle() {
        return this.title;
    }

}


