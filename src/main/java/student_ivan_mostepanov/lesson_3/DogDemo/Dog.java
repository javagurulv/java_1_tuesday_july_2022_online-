package student_ivan_mostepanov.lesson_3.DogDemo;

class Dog {

    String name;
     int age;

     Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

      void  celebrateHappyBirthday() {
        this.age = this.age + 1;
        System.out.println(this.name + "Celebrate Happy Birthday!");
    }
    void voice(){
        System.out.println("My nic = " + this.name);
    }

    void changeName(String newName) {
        this.name = newName;

    }
    int getAge(){

         return this.age;
    }


}
