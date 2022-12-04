package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Book;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.BookDatabase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    String author;
    private BookDatabase bookDatabase;
    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        dataRequest ();
        List<Book> soughtList = new ArrayList<Book>();
        soughtList =  bookDatabase.findByAuthor(author);
        System.out.println(soughtList.toString());
    }
    void dataRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("search by author");
        System.out.println("author:");
        author = input.nextLine();
    }
}
