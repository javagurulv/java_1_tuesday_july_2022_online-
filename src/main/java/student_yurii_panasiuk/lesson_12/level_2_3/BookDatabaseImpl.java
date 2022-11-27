package student_yurii_panasiuk.lesson_12.level_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class BookDatabaseImpl implements BookDatabase {

    Long id;
    ArrayList<Book> bookArrayList = new ArrayList<Book>();

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    @Override
    public String toString() {
        return "BookDatabaseImpl{" +
                "id=" + id +
                ", bookArrayList=" + bookArrayList +
                '}';
    }

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
    @Override
    public Optional<Book> findById(Long bookId) {
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
            return Optional.empty();
        }
        for (Book bookInTheList : bookArrayList) {
            if (bookInTheList.getId().equals(bookId)) {
               return Optional.ofNullable(bookInTheList);
            }
        }
        return Optional.empty();
    }
    @Override
    public List<Book> findByAuthor(String author) {
        List<Book> soughtList = new ArrayList<Book>();
        for (Book bookInTheList : bookArrayList) {
            if (bookInTheList.getAuthor().equals(author)) {
                soughtList.add(bookInTheList);
            }
        }
        return soughtList;
    }

    @Override
    public List<Book> findByTitle(String title){
        List<Book> soughtList = new ArrayList<Book>();
        for (Book bookInTheList : bookArrayList) {
            if (bookInTheList.getTitle().equals(title)) {
                soughtList.add(bookInTheList);
            }
        }
        return soughtList;
    }
    @Override
    public int countAllBooks(){
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
            return 0;
        }
        return bookArrayList.size();
    }
    @Override
    public void deleteByAuthor(String author){
        //Avoiding the ConcurrentModificationException
        ArrayList<Book> bookToDelList = new ArrayList<Book>();
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
        }
        for (Book bookInTheList: bookArrayList) {
            if (bookInTheList.getAuthor().equals(author)) {
                bookToDelList.add(bookInTheList);
            }
        }
        bookArrayList.removeAll(bookToDelList);
    }
    public void deleteByTitle(String title){
        ArrayList<Book> bookToDelList = new ArrayList<Book>();
        if (bookArrayList.isEmpty()) {
            EmptyBaseMassege();
        }
        for (Book bookInTheList: bookArrayList) {
            if (bookInTheList.getTitle().equals(title)) {
                bookToDelList.add(bookInTheList);
            }
        }
        bookArrayList.removeAll(bookToDelList);
    }

    static void EmptyBaseMassege () {
        System.out.println("Databаse is empty");
    }
}








