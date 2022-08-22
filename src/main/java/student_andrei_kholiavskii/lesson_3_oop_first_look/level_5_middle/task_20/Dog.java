package student_andrei_kholiavskii.lesson_3_oop_first_look.level_5_middle.task_20;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Поправь форматирование кода (отступы),"
		+ "они важны для лёгкого чтения кода.")
class Dog {

String dogName;

int dogAge;

Dog(String dogName, int dogAge) {

    this.dogName = dogName;
    this.dogAge = dogAge;
}
    void voice() {

        System.out.println(dogName + " " + dogAge);
    }

	@CodeReviewComment(teacher = "Название метода должно начинаться с маленькой буквы!")
    void HappyBirthDay() {

    dogAge++;
}

}
