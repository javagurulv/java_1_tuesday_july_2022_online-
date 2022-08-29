package student_roman_hytt.lesson_3.level_7;

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
