package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.ui_actions;

import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.Book;
import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите все данные о книге с консоли у пользователя
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter book data: ");
        System.out.println("Author: ");
        String author = userInput.next();

        System.out.println("Title: ");
        String title = userInput.next();

        // создайте экземпляр класса Book (не указывая поле id, его присвоит сама база данных)
        Book book = new Book(title, author);

        // сохраните его в базу данных: bookDatabase.save(book);
        bookDatabase.save(book);
    }

}
