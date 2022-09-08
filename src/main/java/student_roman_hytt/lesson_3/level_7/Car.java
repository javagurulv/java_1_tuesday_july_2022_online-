package student_roman_hytt.lesson_3.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class Car {

String model;
String number;

Car (String model,String number){

    this.model=model;
    this.number=number;

}
String getModel() {return this.model;}

String getNumber() {return this.number;}

void signal() {System.out.println("Beep");}


}
