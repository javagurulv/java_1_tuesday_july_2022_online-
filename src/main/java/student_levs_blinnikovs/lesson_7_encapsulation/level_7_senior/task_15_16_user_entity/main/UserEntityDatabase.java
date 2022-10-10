package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15_16_user_entity.main;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserEntityDatabase {

    List<UserEntity> users = new ArrayList<>();

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    UserEntity getUserById(int id) {                            // TODO probably move to UserActions... and this class leave just for UserDB actions
        for (UserEntity user : this.users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null; // todo using Optional - here, null can be expected
    }

    List<UserEntity> getUsersByFirstName(String firstName) {
        List<UserEntity> searchResults = new ArrayList<>();
        for (UserEntity user : users) {
            if (user.getFirstName().equals(firstName)) {
                    searchResults.add(user);
            }
        }
        return searchResults;
    }

    List<UserEntity> getUserByLastName(String lastName) {
        List<UserEntity> searchResults = new ArrayList<>();
        for (UserEntity user : users) {
            if (user.getLastName().equals(lastName)) {
                    searchResults.add(user);
            }
        }
        return searchResults;
    }

    void printSearchResults(List<UserEntity> searchResults) {
        for (UserEntity searchResult : searchResults) {
            if (searchResult != null) {
                System.out.println("Found: id: " +
                        searchResult.getId() +
                        ", firstname: " +
                        searchResult.getFirstName() +
                        ", lastname: " +
                        searchResult.getLastName() +
                        ", personal code: " +
                        searchResult.getPersonalCode()
                );
            }
        }
    }

}
