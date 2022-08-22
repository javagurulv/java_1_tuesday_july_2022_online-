package student_andrei_kholiavskii.lesson_3_oop_first_look.level_4_junior.task_14;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {

    String title;

    Book(String bookTitle) {

        this.title = bookTitle;
    }

    String getTitle() {

        return this.title;
    }

}
