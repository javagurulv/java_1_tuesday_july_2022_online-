package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Book;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;
    Long id;
    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        dataRequest ();
        bookDatabase.delete(id);
    }
    void dataRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("delete by ID");

        System.out.println("ID:");
        id = input.nextLong();
    }
}
