package student_artjom_vakhromeev.lesson_3.task_18;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Dog {
    String name ;
    String color ;
    int age ;

    public Dog(String name, int age, String color ) {
        this.name = name;
        this.color = color;
        this.age = age ;
    }

    public void voice() {
        System.out.println("I am "+ this.name + " i have " +this.color+ " color and i am "+ this.age +" years old" );}
        public void celebrateHappyBirthday(){this.age = this.age + 1; }

    public void changeColor (String newColor) {this.color = newColor;}


    }