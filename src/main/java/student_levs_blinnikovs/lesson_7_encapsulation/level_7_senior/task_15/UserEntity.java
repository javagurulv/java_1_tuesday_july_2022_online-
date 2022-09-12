package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

/*
Создать класс UserEntity с учетом, что вы уже знаете, что такое инкапсуляция.
У класса UserEntity должны быть поля:
  - id
  - имя
  - фамилия
  - персональный код

 */

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
        this.personalCode = new PersonalCodeGenerator().generatePersonalCode(false);
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    //сохранение пользователя

    //получение пользователя по id
    // in user database

    //получение пользователей по имени
    // in user database

    //получение всех пользователей
    // todo

    //редактирование пользователя
    // todo with setters

    //удаление пользователя
    // todo

}
