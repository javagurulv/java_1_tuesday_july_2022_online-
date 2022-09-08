package student_jelena_voinica.lesson_3;

public class Book {
    String bookTitle;

    Book(String bookTitle){
        this.bookTitle = bookTitle;
    }
        String getTitle(){
        return  this.bookTitle;
    }

}

     class BookDemo{
    public static void main(String[]args){
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();

        System.out.println("Book title = " + bookTitle);
    }
     }