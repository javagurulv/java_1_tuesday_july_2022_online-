package student_olegs_radigins.lesson_3.level4.task_14;

import student_olegs_radigins.lesson_3.level4.task_14.Book;

class BookDemo {
    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);

    }

}
