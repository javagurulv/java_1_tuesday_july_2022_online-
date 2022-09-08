package student_ivan_mostepanov.lesson_3_oop_first_look.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }


}
