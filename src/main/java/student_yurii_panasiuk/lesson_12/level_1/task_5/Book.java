package student_yurii_panasiuk.lesson_12.level_1.task_5;

import java.util.Objects;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getTitle().equals(book.getTitle()) && getAuthor().equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getAuthor());
    }
}