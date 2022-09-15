package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Book {

    private static int lastId = 0;
    private final int id;

    private String title;
    private Author author;
    private int publicationYear;

    private BookStatus bookStatus;

    Book(String title, Author author, int publicationYear) {
        lastId++;
        this.id = lastId;

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }
}
