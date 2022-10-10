package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15_16_user_entity.main;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UsersDemo {

    public static void main(String[] args) {

        UserEntity user1 = new UserEntity("Lev", "Newman");
        UserEntity user2 = new UserEntity("Lev", "Blinnikov");
        UserEntity user3 = new UserEntity("Frank", "Newman");
        UserEntity user4 = new UserEntity("Mary", "Newman");

        PersonalCodeGenerator personalCodeGenerator = new PersonalCodeGenerator();
        String user1PersonalCode = personalCodeGenerator.generatePersonalCode();
        System.out.println(user1PersonalCode);


        UserEntityDatabase db = new UserEntityDatabase();
        db.setUsers(List.of(user1, user2, user3, user4));


        System.out.println(db.getUserById(1).firstName); // todo wrap with some provideUserInfo() method
        System.out.println(db.getUserById(2).firstName);
        System.out.println(db.getUserById(3).firstName);
        System.out.println(db.getUserById(4).firstName);

        List<UserEntity> searchResultsLevFirstName = db.getUsersByFirstName("Lev");   // todo wrap in one method that search by everything
        db.printSearchResults(searchResultsLevFirstName);

        List<UserEntity> searchResultsNewmanLastName = db.getUserByLastName("Newman"); // todo ignore case
        db.printSearchResults(searchResultsNewmanLastName);






    }
}
