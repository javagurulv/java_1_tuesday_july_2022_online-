package student_andrei_kholiavskii.lesson_3_oop_first_look.level_5_middle.task_19;

class Dog {

   String dogName;

   int dogAge;

   Dog(String dogName, int dogAge) {

       this.dogName = dogName;
       this.dogAge = dogAge;

   }

    void voice(){

       System.out.println(dogName + " " + dogAge);
    }

}
