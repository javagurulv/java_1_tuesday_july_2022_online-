package student_levs_blinnikovs.lesson_8_inheritance.level_6_middle.task_31_library;

class Book {

    private static int lastId = 0;
    private final int id;

    public String title;
    public String author;
    public int publicationYear;

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

}
