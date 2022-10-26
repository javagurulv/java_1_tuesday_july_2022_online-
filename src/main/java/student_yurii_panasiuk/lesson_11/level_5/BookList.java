package student_yurii_panasiuk.lesson_11.level_5;

import java.util.ArrayList;

class BookList  {

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
    BookList searchByAutror (String searchedAuthor) {
        BookList searchResult = new BookList();
        for (Book book : books) {
            if (book.getBookAutor().equals(searchedAuthor)){
                searchResult.addBook(book);
            }
        }
        return searchResult;
    }

    BookList searchByTitle (String searchedTitle) {
        BookList searchResult = new BookList();
        for (Book book : books) {
            if (book.getBookTitle().equals(searchedTitle)){
                searchResult.addBook(book);
            }
        }
        return searchResult;
    }

    BookList searchByAutrorPartially (String searchedAuthor) {
        BookList searchResultPartially = new BookList();
        for (Book book : books) {
            if (book.getBookAutor().contains(searchedAuthor)){
                searchResultPartially.addBook(book);
            }
        }
        return searchResultPartially;
    }

    BookList searchByTitlePartially (String searchedTitle) {
        BookList searchResultPartially = new BookList();
        boolean ignoreCase = true;
        int symbolAmmountTosearch = searchedTitle.length();
        for (Book book : books) {
            if (book.getBookTitle().regionMatches(ignoreCase, 0, searchedTitle,0, symbolAmmountTosearch)){
                searchResultPartially.addBook(book);
            }
        }
        return searchResultPartially;
    }


    int librarySize (){
        if (books.isEmpty()) {
            return 0;
        }
          else{ return this.books.size();}
        }

        Book extractBook (int bookNumber){
           return this.books.get(bookNumber);
        }



 }

