package student_eduard_minajev.lesson_3_oop_first_look.homework.level_4_junior.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Book {
    String title;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}
