package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.ui_actions;

import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.Book;
import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите автора книги с консоли у пользователя
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter book title: ");
        String title = userInput.next();

        // поиск книги в базе данных
        List<Book> bookList = bookDatabase.findByTitle(title);

        // выведите на консоль результаты поиска
        System.out.println(bookList);
    }

}
