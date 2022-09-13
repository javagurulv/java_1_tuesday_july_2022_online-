package student_roman_hytt.lesson_5.level_4;

import java.util.Scanner;

public class UserNumber {
public static void main (String[]args){
System.out.println("Write your array length");
Scanner scanner=new Scanner(System.in);
int arrayLength = scanner.nextInt();
int [] number=new int[arrayLength];
  for (int i=0;i< number.length;i++){

   System.out.println("Enter number"+(i+1));
  number[i] =scanner.nextInt();
  }


  for (int i=0;i< number.length;i++) {
      System.out.println(number[i]);

  }

}




}
