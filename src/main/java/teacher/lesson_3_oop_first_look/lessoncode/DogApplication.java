package teacher.lesson_3_oop_first_look.lessoncode;

class DogApplication {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Sharik", 10);
		dog1.celebrateHappyBirthday();
		dog1.celebrateHappyBirthday();
		dog1.voice();
		dog1.changeNickname("Avatar");
		dog1.voice();

		Dog dog2 = new Dog("Bobik", 50);
		dog2.celebrateHappyBirthday();

		Dog dog3 = new Dog("Barbosik", 1);
		dog3.celebrateHappyBirthday();

		Dog dogWithMaxAge = maxAge(dog1, dog2);
		dogWithMaxAge = maxAge(dogWithMaxAge, dog3);
		dogWithMaxAge.voice();
	}


	static Dog maxAge(Dog dog1, Dog dog2) {
		int dog1Age = dog1.getAge();
		int dog2Age = dog2.getAge();
		if (dog1Age > dog2Age) {
			return dog1;
		} else {
			return dog2;
		}
	}

}
