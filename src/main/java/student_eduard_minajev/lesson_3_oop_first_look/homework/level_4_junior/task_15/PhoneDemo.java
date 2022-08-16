package student_eduard_minajev.lesson_3_oop_first_look.homework.level_4_junior.task_15;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
