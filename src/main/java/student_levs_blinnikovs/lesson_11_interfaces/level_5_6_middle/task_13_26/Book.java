package student_levs_blinnikovs.lesson_11_interfaces.level_5_6_middle.task_13_26;

class Book {

    private String author;
    private String title;
    private boolean isRead;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
        this.isRead = false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }

    @Override
    public String toString() {
        return title + " [" + author + "]";
    }
}
