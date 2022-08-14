package student_yurii_panasiuk.lesson_3.level_4.Task_15;

class Phone {

    String model;
    String newModel;

        Phone(String newModel) {
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
