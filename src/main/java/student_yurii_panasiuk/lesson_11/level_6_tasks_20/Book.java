package student_yurii_panasiuk.lesson_11.level_6_tasks_20;

 class Book {
     private String bookAutor;
     private String bookTitle;

     private int id = 0;

     private ReadStatus status = ReadStatus.UNREAD;

     public ReadStatus getStatus() {
         return status;
     }

     Book() {
     }
     public void setReadStatus() {
         this.status = ReadStatus.READ;
     }


     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }

     void setBookAutor(String bookAutor) {
         this.bookAutor = bookAutor;
     }

     void setBookTitle(String bookTitle) {
         this.bookTitle = bookTitle;
     }

     String getBookAutor() {
         return bookAutor;
     }

      String getBookTitle() {
         return bookTitle;
     }
 }
