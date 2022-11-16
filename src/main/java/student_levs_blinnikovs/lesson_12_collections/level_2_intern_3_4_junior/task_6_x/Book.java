package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior.task_6_x;

import java.util.Objects;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Book {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    Book(String title, String author, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author) && yearOfIssue.equals(book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, yearOfIssue);
    }
}
