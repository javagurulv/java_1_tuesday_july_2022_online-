package student_olegs_radigins.lesson_3.level5.task_21;

class Dog {
    String dogName;
    int dogAge;
    String dogColor;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColor = dogColor;
    }

    public String getDogName() {
        return dogName;
    }

    public int getDogAge() {
        return dogAge;
    }

    public String getDogColor() {
        return dogColor;
    }

    void dogVoice() {
        System.out.println("Dog's name: " + dogName + ", age: " + dogAge + ", color: " + dogColor);
    }
    void happyBirthday() {
        dogAge++;
    }
}
