package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

import teacher.lesson_x.login_service.solutions.super_task_1.User;

class Users {

    UserEntity[] users;

    // creates DB with specified capacity
    Users(int usersDataBaseCapacity) {
        this.users = new UserEntity[usersDataBaseCapacity];
    }

    UserEntity getUserById(int id) {                            // TODO probably move to UserActions... and this class leave just for UserDB actions
        for (UserEntity user : this.users) {
            if (id == user.getId()) {
                return user;
            }
        }
        return null; // todo...
    }

    UserEntity[] getUserByFirstName(String firstName) {
        System.out.println("Search results for \"" + firstName + "\": ");
        UserEntity[] firstNameSearchResults = new UserEntity[users.length];
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] != null && this.users[i].getFirstName().equals(firstName)) {
                firstNameSearchResults[i] = this.users[i];
            }
        }
        return firstNameSearchResults;
    }

    UserEntity[] getUserByLastName(String lastName) {
        System.out.println("Search results for \"" + lastName + "\": ");
        UserEntity[] lastNameSearchResults = new UserEntity[users.length];
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i] != null && this.users[i].getLastName().equals(lastName)) {          // todo wrap null checks to methods
                lastNameSearchResults[i] = this.users[i];
            }
        }
        return lastNameSearchResults;
    }

    void printSearchResults(UserEntity[] searchResults) {
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

    public boolean isEmptySlot(int index) {
        return users[index] == null;
    }

    public boolean isUsersDatabaseFull() {
        for (int i = 0; i < users.length; i++) {
            if (isEmptySlot(i)) {
                return false;
            }
        }
        return true;
    }

    public void addUserToDatabase(UserEntity user) {
        if (!isUsersDatabaseFull()) {
            for (int i = 0; i < users.length; i++) {
                if (isEmptySlot(i)) {
                    users[i] = user;
                    break;
                }
            }
        } else System.out.println("Can't add " + user + " database is full!");
    }

}
