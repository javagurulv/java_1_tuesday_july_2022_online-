package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15_16;

class UserEntityDemo {

    public static void main(String[] args) {

        UserEntity user1 = new UserEntity("Lev", "Newman");
        UserEntity user2 = new UserEntity("Lev", "Blinnikov");
        UserEntity user3 = new UserEntity("Frank", "Newman");
        UserEntity user4 = new UserEntity("Mary", "Newman");

        PersonalCodeGenerator personalCodeGenerator = new PersonalCodeGenerator();
        String user1PersonalCode = personalCodeGenerator.generatePersonalCode(true);
        System.out.println(user1PersonalCode);


        Users db = new Users(10);
        db.addUserToDatabase(user1);
        db.addUserToDatabase(user2);
        db.addUserToDatabase(user3);
        db.addUserToDatabase(user4);

        System.out.println(db.getUserById(1).firstName); // todo wrap with some provideUserInfo() method
        System.out.println(db.getUserById(2).firstName);
        System.out.println(db.getUserById(3).firstName);
        System.out.println(db.getUserById(4).firstName);

        UserEntity[] searchResultsLevFirstName = db.getUserByFirstName("Lev");   // todo wrap in one method that search by everything
        db.printSearchResults(searchResultsLevFirstName);

        UserEntity[] searchResultsNewmanLastName = db.getUserByLastName("Newman"); // todo ignore case
        db.printSearchResults(searchResultsNewmanLastName);






    }
}
