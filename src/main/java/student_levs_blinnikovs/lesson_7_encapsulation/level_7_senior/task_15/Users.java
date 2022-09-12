package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

class Users {

    UserEntity[] users;

    Users(int usersDataBaseCapacity) {
        this.users = new UserEntity[usersDataBaseCapacity];
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
