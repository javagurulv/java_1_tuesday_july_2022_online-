package student_eduard_minajev.lesson_3_oop_first_look.homework.level_5_middle;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class DogDemo {
    public static void main(String[] args){
        Scanner dogName = new Scanner(System.in);
        System.out.println("Please give dog name!");
        String nameForDog = dogName.nextLine();
        Scanner dogAge = new Scanner(System.in);
        System.out.println("How old is thi dog?");
        int ageOfDog = dogAge.nextInt();
        System.out.println("And what color of hair dog has?");
        Scanner dogHairColor = new Scanner(System.in);
        String hairOfDog = dogHairColor.nextLine();
        Dog dog1 = new Dog(nameForDog,ageOfDog,hairOfDog);
        String doggyName = dog1.sayDogName();
        for (int i = 1; i < 4; i++){
            System.out.println(doggyName);}
        dog1.celebrateBirthday();
        System.out.println("What color you want to re-paint your dog?");
        Scanner newDogColor = new Scanner(System.in);
        String color2 = newDogColor.nextLine();
        dog1.changeHair(color2);
        dog1.dogTellEverything();








    }
}
