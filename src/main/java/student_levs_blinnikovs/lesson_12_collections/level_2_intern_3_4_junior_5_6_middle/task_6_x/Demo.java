package student_levs_blinnikovs.lesson_12_collections.level_2_intern_3_4_junior_5_6_middle.task_6_x;

import teacher.codereview.CodeReview;

import java.util.List;
import java.util.Map;

@CodeReview(approved = true)
class Demo {
    public static void main(String[] args) {
        BookDatabaseImpl db = new BookDatabaseImpl();

          Book book1 = new Book("Normal People", "Sally Rooney");
          Book book2 = new Book("1984", "George Orwell");
          Book book3 = new Book("The Financier", "Theodore Dreiser");
          Book book4 = new Book("Life After Life", "Jill McCorkle");
          Book book5 = new Book("Life After Life", "Kate Atkinson");
          Book book6 = new Book("Animal Farm", "George Orwell");

          db.save(book1);
          db.save(book2);
          db.save(book3);
          db.save(book4);
          db.save(book5);
          db.save(book6);

//        System.out.println("Result of 1st save should return 1: " + db.save(book1));
//        System.out.println("Result of 2nd save should return 2: " + db.save(book2));
//        System.out.println("Result of 3rd save should return 3: " + db.save(book3));
//
//        System.out.println("Id of 1st book should return 1: " + book1.getId());
//        System.out.println("Id of 2nd book should return 2: " + book2.getId());
//        System.out.println("Id of 3rd book should return 3: " + book3.getId());
//
//        System.out.println("Deletion demos");
//        System.out.println("Result of 1st delete should return true: " + db.delete(1L));
//        System.out.println("Result of not existing delete should return false: " + db.delete(5L));
//        System.out.println("Result of 2nd delete should return true: " + db.delete(2L));
//        System.out.println("Result of 3rd delete should return true: " + db.delete(3L));
//        System.out.println("Result of previously existing (i.e. 3L) delete should return false: " + db.delete(3L));

        Map<String, List<Book>> demoMap = db.getAuthorToBooksMap();
        System.out.println(demoMap);
    }
}
