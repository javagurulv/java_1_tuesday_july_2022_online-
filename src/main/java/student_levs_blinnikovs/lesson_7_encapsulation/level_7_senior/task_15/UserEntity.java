package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

/*
Создать класс UserEntity с учетом, что вы уже знаете, что такое инкапсуляция.
У класса UserEntity должны быть поля:
  - id
  - имя
  - фамилия
  - персональный код

 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

class UserEntity {

    private static int lastId = 0;
    private final int id;
    String firstName;
    String lastName;
    private final String personalCode;



    //создание пользователя
    UserEntity(String firstName, String lastName) {
        lastId++;
        this.id = lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalCode = new PersonalCodeGenerator().generatePersonalCode();
    }

    //сохранение пользователя
    void addUser(UserEntity user) {
        Users usersDatabase = new Users(10);
        usersDatabase.addUserToDatabase(user);
    }

    //получение пользователя по id
    UserEntity getUserById(int id) {
        return new UserEntity("First", "Last");  // TODO. .. how to make database with static memory spin in the background...?
    }

    //получение пользователей по имени

    //получение всех пользователей

    //редактирование пользователя
    //удаление пользователя

}
