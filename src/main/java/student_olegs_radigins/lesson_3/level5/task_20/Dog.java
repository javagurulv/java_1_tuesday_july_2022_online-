package student_olegs_radigins.lesson_3.level5.task_20;

class Dog {
    String dogName;
    int dogAge;

    public Dog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    void dogVoice() {
        System.out.println("Dog's name: " + dogName + ", age: " + dogAge);
    }
    void happyBirthday() {
       dogAge++;
    }

}
