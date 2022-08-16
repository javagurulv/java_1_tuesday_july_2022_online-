package student_andrei_kholiavskii.lesson_3_oop_first_look.level_4_junior.task_14;

class BookDemo {

    public static void main(String[] args) {
        Book myBook = new Book("Principles");
        String bookTitle = myBook.getTitle();
        System.out.println("Book title = " + bookTitle);
    }

}
