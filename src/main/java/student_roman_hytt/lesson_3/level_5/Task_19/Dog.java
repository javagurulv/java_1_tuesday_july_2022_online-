package student_roman_hytt.lesson_3.level_5.Task_19;

import teacher.codereview.CodeReview;
import teacher.codereview.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(teacher = "Собаку можно создавать только с кличкой или или только с возрастом?")
public class Dog {
String name;
int age;
    Dog (String name) {  this.name= name; }
    Dog (int age) { this.age=age;}

    void voice () { System.out.println (name +" "+ age);}



}
