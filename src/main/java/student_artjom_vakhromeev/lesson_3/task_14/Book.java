package student_artjom_vakhromeev.lesson_3.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title ;

    Book(String bookTitle) {
        this.title = bookTitle;
    }

    String getTitle() {
        return this.title;
    }

}
