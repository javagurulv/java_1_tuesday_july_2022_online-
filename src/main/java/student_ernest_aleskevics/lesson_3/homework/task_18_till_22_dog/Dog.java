package student_ernest_aleskevics.lesson_3.homework.task_18_till_22_dog;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dog {
    String nickName, color;
    int age;
    Dog(String nickName, int age, String color) {
        this.nickName = nickName;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        System.out.println("My nickname = " + this.nickName + ". " + "I am " + this.age + " old dog. I am " + this.color);
    }
    void happyBirthday() {
        this.age = this.age +1;
        System.out.println("Happy Birthday");
        System.out.println("My nickname = " + this.nickName + ". " + "I am " + this.age + " old dog. I am " + this.color);
    }
    void changeColor(String newColor) {
        this.color = newColor;
        System.out.println("Hello I change my color to " + this.color);
    }



}
