package student_yurii_panasiuk.lesson_11.level_3.task_8;

 class InMemoryDatabaseTest2 {

     public static void main(String[] args) {

         Product product1 = new Product("Milk");
         Product product2 = new Product("Beef");
         Product product3 = new Product("Сucumber");

         InMemoryDatabase testDatabase = new InMemoryDatabase ();
         testDatabase.save(product1);
         testDatabase.save(product2);
         testDatabase.save(product3);

         System.out.println(testDatabase.findByTitle("Milk").getTitle());
         }

}
