package teacher.lesson_3_oop_first_look.lessoncode;

import java.util.Scanner;

public class DogDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter dog name: ");
		String dogName = scanner.nextLine();
		System.out.println("Enter dog age: ");
		int dogAge = scanner.nextInt();

		Dog sharik = new Dog(dogName, dogAge);


		Dog bobik = new Dog("Pupsik", 9);

		sharik.voice();
		sharik.voice();
		sharik.voice();

		bobik.voice();
		bobik.voice();
		bobik.voice();

		sharik.voiceYourName();
		bobik.voiceYourName();

		sharik.voiceYourAge();
		bobik.voiceYourAge();


		sharik.voiceYourName();
		sharik.changeName("Mopsik");
		sharik.voiceYourName();

	}

}
