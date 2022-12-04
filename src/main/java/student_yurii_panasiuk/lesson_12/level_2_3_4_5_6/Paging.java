package student_yurii_panasiuk.lesson_12.level_2_3_4_5_6;

import java.util.ArrayList;
import java.util.List;

public class Paging {

   private int linesPerPage = 2;
   private ArrayList<Book> bookArrayList;

    public Paging(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public  List<Book>  getPage (int pageNumber) {
        System.out.println("page: " + pageNumber);
        List<Book> soughtList = new ArrayList<Book>();

       if ((pageNumber > (int)Math.ceil((double)bookArrayList.size()/linesPerPage)) || pageNumber <= 0){
        throw new IllegalArgumentException("invalid page: " + pageNumber);
    }

       for (int i = 0; i < linesPerPage; i++){
          int position = (i+(pageNumber*linesPerPage) - linesPerPage);
          if (position < bookArrayList.size()) {
             soughtList.add(bookArrayList.get(position));
           }
       }
       return soughtList;
    }
}
