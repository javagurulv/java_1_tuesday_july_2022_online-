package student_levs_blinnikovs.lesson_8_inheritance.level_7_senior.task_31_library;

class Book {

    private static int lastId = 0;
    private final int id;

    private String title;
    private String author;
    private int publicationYear;

    private User reservedBy;

    private User takenBy;  // no need for boolean flag, if null then not taken

    Book(String title, String author, int publicationYear) {
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

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public User getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(User reservedBy) {
        this.reservedBy = reservedBy;
    }

    public User getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(User takenBy) {
        this.takenBy = takenBy;
    }
}
