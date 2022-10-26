package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;

class BookList {


    ArrayList<Book> books = new ArrayList<>();



    void addBook(Book newBook) {
        if (!this.books.contains(newBook) &&
                newBook.getBookAutor() !=null &&
                newBook.getBookTitle() !=null ) {
            this.books.add(newBook);
        }
    }

    void delBook(Book newBook) {
        if (this.books.contains(newBook) &&
                newBook.getBookAutor() !=null &&
                newBook.getBookTitle() !=null ) {
            this.books.remove(newBook);
        }
    }

    void printBooks() {

        for (int i=0; i< books.size(); i++){
          System.out.print(books.get(i).getBookAutor());
            System.out.print("      ");
          System.out.println(books.get(i).getBookTitle());

        }
    }

    int librarySize (){
        if (books.isEmpty()) {
            return 0;
        }
          else{ return this.books.size();}
        }
    }

