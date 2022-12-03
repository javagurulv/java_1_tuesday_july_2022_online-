package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Book;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    String author;
    String tittle;
    String year;
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        dataRequest ();

        Book bookToAdd = new Book(author, tittle, year);

        bookDatabase.save(bookToAdd);
    }
    void dataRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("new book addition");

        System.out.println("author:");
        author = input.nextLine();

        System.out.println("tittle:");
        tittle = input.nextLine();

        System.out.println("year:");
        year = input.nextLine();
    }

}