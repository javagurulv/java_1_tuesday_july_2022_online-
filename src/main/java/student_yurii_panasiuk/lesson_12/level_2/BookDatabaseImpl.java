package student_yurii_panasiuk.lesson_12.level_2;

import java.util.ArrayList;

class BookDatabaseImpl implements BookDatabase {

     Long id;
     ArrayList<Book> bookArrayList;

     public Long save(Book book){
         if (bookArrayList.isEmpty()){
             id = 1L;
         }
             else { book.setId(
                  ((bookArrayList.get(bookArrayList.size() - 1)).getId()) + 1);
             }
         bookArrayList.add(book);
     return book.getId();
         }
 }



