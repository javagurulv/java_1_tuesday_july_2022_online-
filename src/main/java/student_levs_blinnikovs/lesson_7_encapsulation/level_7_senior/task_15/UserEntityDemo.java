package student_levs_blinnikovs.lesson_7_encapsulation.level_7_senior.task_15;

class UserEntityDemo {
    public static void main(String[] args) {

        UserEntity user1 = new UserEntity("Lev", "Newman");

        PersonalCodeGenerator personalCodeGenerator = new PersonalCodeGenerator();

        String user1PersonalCode = personalCodeGenerator.generatePersonalCode();
        System.out.println(user1PersonalCode);

    }
}
