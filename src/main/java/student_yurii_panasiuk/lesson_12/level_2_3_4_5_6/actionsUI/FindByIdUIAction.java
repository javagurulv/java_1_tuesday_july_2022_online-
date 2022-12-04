package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Book;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.BookDatabase;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Paging;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;
    Long id;
    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        dataRequest ();
        Optional<Book> soughtBook = Optional.empty();
        soughtBook =  bookDatabase.findById(id);
        System.out.println(soughtBook);
    }

    void dataRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("search by ID");

        System.out.println("ID:");
        id = input.nextLong();
    }
}