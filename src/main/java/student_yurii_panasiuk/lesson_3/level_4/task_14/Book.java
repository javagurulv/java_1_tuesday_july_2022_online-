package student_yurii_panasiuk.lesson_3.level_4.task_14;

public class Book {

    String title;
    String newTitle;

        Book(String bookTitle) {
            this.title = bookTitle;
        }

        String getTitle() {
            return this.title;
        }

    }

    class BookDemo {

        public static void main(String[] args) {
            Book myBook = new Book("Principles");
            String bookTitle = myBook.getTitle();
            System.out.println("Book title = " + bookTitle);
        }

    }

