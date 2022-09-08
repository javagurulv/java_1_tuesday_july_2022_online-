package student_roman_hytt.lesson_3.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }


}
