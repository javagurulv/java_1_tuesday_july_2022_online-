package student_levs_blinnikovs.lesson_3_oop_first_look.level_4_junior.task_15;

/*
Найти ошибку в коде.
        Исправить и запустить программу.
        Менять можно только класс Phone.
 */

class Phone {

    String model; // unexpected {

        Phone (String newModel) {
            this.model = newModel;
        }

        String getModel() {
            return this.model;
        }

    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
