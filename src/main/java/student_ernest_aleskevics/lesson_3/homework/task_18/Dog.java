package student_ernest_aleskevics.lesson_3.homework.task_18;

class Dog {
    String nickName;
    int age;
    Dog(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
    }
    void voice(){
        System.out.println("My nickname = " + this.nickName + ". " + "I am " + this.age + " old dog.");
    }


}
