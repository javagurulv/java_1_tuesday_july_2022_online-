package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.ui_actions;

import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.Book;
import student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        // запросите id книги с консоли у пользователя
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter book id: ");
        Long id = userInput.nextLong();

        // поиск книги в базе данных
        Optional<Book> bookOpt = bookDatabase.findById(id);

        // выведите на консоль результаты поиска
        System.out.println(bookOpt);
    }

}
