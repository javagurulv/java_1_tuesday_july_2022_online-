package student_andrei_kholiavskii.lesson_3_oop_first_look.level_4_junior.task_15;

public class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }

}
