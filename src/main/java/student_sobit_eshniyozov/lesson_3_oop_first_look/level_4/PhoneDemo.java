package student_sobit_eshniyozov.lesson_3_oop_first_look.level_4;

class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
