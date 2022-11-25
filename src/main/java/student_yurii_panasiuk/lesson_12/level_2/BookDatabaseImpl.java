package student_yurii_panasiuk.lesson_12.level_2;

import java.util.ArrayList;

class BookDatabaseImpl implements BookDatabase {

    Long id;
    ArrayList<Book> bookArrayList = new ArrayList<Book>();

   @Override
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

    @Override
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
    @Override
    public boolean delete(Book book){
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
            return false;
        }
        for (Book bookInTheList: bookArrayList) {
            if (bookInTheList.equals(book)) {
                bookArrayList.remove(book);
                return true;
            }
        }
        return false;
    }
    static void EmptyBaseMassege () {
        System.out.println("Databаse is empty");
    }


}








