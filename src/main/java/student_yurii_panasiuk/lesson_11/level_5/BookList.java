package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;

class BookList {


    ArrayList<Book> books = new ArrayList<>();



    void setBook(Book newBook) {
        if (!this.books.contains(newBook)) {
            this.books.add(newBook);
        }
    }

    ArrayList<Book> getBooks() {

        return this.books;
    }

    int librarySize (){
        if (books.isEmpty()) {
            return 0;
        }
          else{ return this.books.size();}
        }
    }

