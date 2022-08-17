package student_ernest_aleskevics.lesson_3.homework.task_19;

class Dog {
    String nickName;
    int age;
    Dog(String nickName, int age) {
        this.nickName = nickName;
        this.age = age;
    }
    public void voice(){
        System.out.println("My nickname = " + this.nickName + ". " + "I am " + this.age + " old dog.");
    }
    void happyBirthday() {
        this.age = this.age +1;
        System.out.println("Happy Birthday");
        System.out.println("My nickname = " + this.nickName + ". " + "I am " + this.age + " old dog.");

    }




}
