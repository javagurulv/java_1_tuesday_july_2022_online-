package student_yurii_panasiuk.lesson_12.level_2;

import java.util.ArrayList;
import java.util.Iterator;

class BookDatabaseImpl implements BookDatabase {

    Long id;
    ArrayList<Book> bookArrayList = new ArrayList<Book>();

    public Long save(Book book) {
        if (bookArrayList.isEmpty()) {
            book.setId(1L);
        } else {
            book.setId(
                    ((bookArrayList.get(bookArrayList.size() - 1)).getId()) + 1);
        }
        bookArrayList.add(book);
        return book.getId();
    }

    public boolean delete(Long bookId) {
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
            return false;
        }
        for (Book book: bookArrayList) {
            if (book.getId().equals(bookId)) {
                bookArrayList.remove(book);
                return true;
            }
        }
        return false;
    }
    static void EmptyBaseMassege () {
        System.out.println("Datasbese is empty");
    }


}








