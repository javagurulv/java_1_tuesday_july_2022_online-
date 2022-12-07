package student_olegs_radigins.lesson_12.level_2;

import java.util.Objects;

class Book {
    private Long id;
    private String title;
    private String author;

    public Book(String author, String title) {
        this.title = title;
        this.author = author;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(getId(), book.getId()) && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor());
    }
}
