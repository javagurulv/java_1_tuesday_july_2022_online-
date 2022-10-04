package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15_16_user_entity.test;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserEntityTest {

    // TDD

    //создание пользователя
    void shouldCreateUser() {

    }

    //сохранение пользователя
    void shouldSaveUser() {

    }

    //получение пользователя по id
    void shouldGetUserById() {

    }

    //получение пользователей по имени
    void shouldGetUserByName() {           // todo firstname, lastname.. or search by one param in both?

    }

    //получение всех пользователей
    void shouldGetAllUsers() {

    }

    //редактирование пользователя
    void shouldUpdateUser() {

    }

    //удаление пользователя
    void shouldDeleteUser() {

    }

    public static void main(String[] args) {
        UserEntityTest test = new UserEntityTest();

        test.shouldCreateUser();
        test.shouldSaveUser();
        test.shouldGetUserById();
        test.shouldGetUserByName(); // todo... firstname lastname
        test.shouldGetAllUsers();
        test.shouldUpdateUser();
        test.shouldDeleteUser();

    }
}
