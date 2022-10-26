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
        for (Book book : books) {
            System.out.print(book.getBookAutor());
            System.out.print("      ");
            System.out.println(book.getBookTitle());

        }
    }
    ArrayList<Book> searchByAutror (String searchedAuthor) {
        ArrayList<Book> searchResult = new ArrayList<>();
        for (Book book : books) {
            if (book.getBookAutor().equals(searchedAuthor)){
                searchResult.add(book);
            }
        }
        return searchResult;
    }


    int librarySize (){
        if (books.isEmpty()) {
            return 0;
        }
          else{ return this.books.size();}
        }
    }

