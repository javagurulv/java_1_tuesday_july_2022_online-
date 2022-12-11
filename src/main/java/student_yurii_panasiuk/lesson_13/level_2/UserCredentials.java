package student_yurii_panasiuk.lesson_13.level_2;

import java.util.List;

class UserCredentials {

    private List<Role> roles;

     UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

     List<Role> getRoles() {
        return roles;
    }
    // создайте конструктор класса, в котором вы получаете список ролей

}