package student_andrei_kholiavskii.lesson_3_oop_first_look.level_5_middle.task_18;

class Dog {

	String dogName;

	public Dog(String dogName) {
		this.dogName = dogName;
	}

/*
	public void changeDogName(String newDogName) {
		this.dogName = newDogName;
	}
*/

	public String getDogName() {
		return dogName;
	}

	void voice() {
		System.out.println(dogName + " " + this.dogName + " " + dogName + "!");
	}

}
