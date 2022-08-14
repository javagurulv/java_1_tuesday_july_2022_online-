package student_yurii_panasiuk.lesson_3.level_4_junior.task_15;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
class Phone {

    String model;

	@CodeReviewComment(teacher = "Зачем это свойство?")
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
