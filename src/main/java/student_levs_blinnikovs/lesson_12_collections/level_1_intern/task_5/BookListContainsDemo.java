package student_levs_blinnikovs.lesson_12_collections.level_1_intern.task_5;

import java.util.ArrayList;
import java.util.List;

class BookListContainsDemo {

 public static void main(String[] args) {
  List<Book> books = new ArrayList<>();

  Book book1 = new Book("Sally Rooney", "Normal People");
  Book book2 = new Book("1984", "George Orwell");

  books.add(book1);
  books.add(book2);

  Book bookInTheList = new Book("Sally Rooney", "Normal People");
  boolean containsBook = books.contains(bookInTheList); // должно быть true
  System.out.println("Contains book in the list (return true): " + containsBook);

  Book bookNotInTheList = new Book("Theodore Dreiser", "The Financier");
  boolean notContainsBook = books.contains(bookNotInTheList); // должно быть false
  System.out.println("Should not contain book that wasn't added to the list (return false): " + notContainsBook);

 }

}
