package student_yurii_panasiuk.lesson_11.level_6_tasks_20_24;

 class Book {
     private String bookAutor;
     private String bookTitle;

     private int id = 0;

     private ReadStatus status = ReadStatus.UNREAD;

     Book() {
     }
     ReadStatus getStatus() {
         return status;
     }

     void setReadStatus() {
         this.status = ReadStatus.READ;
     }
     void setUnreadStatus() {
         this.status = ReadStatus.UNREAD;
     }

     int getId() {
         return id;
     }

     void setId(int id) {
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
