package teacher.lesson_7_encapsulation.lessoncode;

import teacher.lesson_8_inheritance.lessoncode.Book;

class DogDemo {

    public static void main(String[] args){

		Dog dog1 = new Dog("Sharik", "man");
		Dog dog2 = new Dog("Sharik", "man");
		Dog dog3 = new Dog("Barbos", "man");

		System.out.println(dog1.equals(dog2));
		System.out.println(dog1.equals(dog3));

		Book book = new Book("AAA");

		Book unknownBook = null;
		//unknownBook = new Book("BBB");
		System.out.println(dog1.equals(unknownBook));
		System.out.println(dog1.equals(null));


		System.out.println(dog1 == dog2);
		System.out.println(dog1.equals(dog1));

		System.out.println(dog1.equals(book));


		System.out.println(dog1.equals(dog2));

		System.out.println(dog1.getDogName());

		dog1.changeDogName("Barbos");

		System.out.println(dog1.getDogName());

		dog1.voice();

    }

}
