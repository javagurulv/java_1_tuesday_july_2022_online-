package teacher.lesson_3_oop_first_look.lessoncode;

class Dog {

	String nickname;
	int age;

	Dog(String nickname, int age) {
		this.nickname = nickname;
		this.age = age;
	}

	void celebrateHappyBirthday() {
		int age = 10;
		this.age = this.age + 1;
		System.out.println(this.nickname + " celebrate Happy Birthday!");
	}

	void voice() {
		System.out.println("My nic = " + this.nickname);
	}

	void changeNickname(String newNickname) {
		this.nickname = newNickname;
	}

	int getAge() {
		return this.age;
	}

}
