package student_yurii_panasiuk.lesson_12.level_2_3;

import java.util.Objects;

class Book {

         private Long id;
         private String title;
         private String author;

         private String yearOfIssue;

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
    Book(String author, String title) {
        this.author = author;
        this.title = title;
    }
    Book(String author, String title, String yearOfIssue) {  // переписывать все инициализации скучно
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

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }

         @Override
         public boolean equals(Object o) {
             if (this == o) return true;
             if (o == null || getClass() != o.getClass()) return false;
             Book book = (Book) o;
             return id.equals(book.id) && title.equals(book.title) && author.equals(book.author) &&
                     yearOfIssue.equals(book.yearOfIssue);
         }

         @Override
         public int hashCode() {
             return Objects.hash(id, title, author, yearOfIssue);
         }

}
