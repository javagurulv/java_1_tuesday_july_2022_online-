package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.actionsUI;

import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.Book;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.BookDatabase;
import student_yurii_panasiuk.lesson_12.level_2_3_4_5_6.MyPagination;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    String author;
    private BookDatabase bookDatabase;
    private List<Book> soughtList = new ArrayList<Book>();
    private int pageNumber = 0;
    public FindByAuthorUIAction(BookDatabase bookDatabase) {

        this.bookDatabase = bookDatabase;
    }
    public FindByAuthorUIAction(BookDatabase bookDatabase, int pageNumber) {
        this.bookDatabase = bookDatabase;
        this.pageNumber = pageNumber;
    }

    @Override
    public void execute() {
        dataRequest ();
        soughtList =  bookDatabase.findByAuthor(author);
        if (pageNumber == 0) {
            System.out.println(soughtList.toString());
        } else {
            for (Book book :  getPage ()){ System.out.println(book); };
           }
    }

    void dataRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("search by author");
        System.out.println("author:");
        author = input.nextLine();
    }

     public List<Book> getPage() {
         List<Book> soughtPageList = new ArrayList<Book>();
            System.out.println("page: " + pageNumber);
            int linesPerPage = 2;
          if ((pageNumber > (int)Math.ceil((double)soughtList.size()/linesPerPage)) || pageNumber <= 0){
                throw new IllegalArgumentException("invalid page: " + pageNumber);
            }
            for (int i = 0; i < linesPerPage; i++){
                int position = (i+(pageNumber*linesPerPage) - linesPerPage);
                if (position < soughtList.size()) {
                    soughtPageList.add(soughtList.get(position));
                }
            }
            return soughtPageList;
     }
}

