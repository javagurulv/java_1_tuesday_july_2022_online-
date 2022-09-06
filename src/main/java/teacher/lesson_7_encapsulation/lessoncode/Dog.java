package teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

class Dog {

	private String dogName;
	private String sex;

	public Dog(String dogName, String sex) {
		this.dogName = dogName;
		this.sex = sex;
	}

	public void changeDogName(String newDogName) {
		this.dogName = newDogName;
/*
		if (!"Belka".equals(newDogName)) {
			this.dogName = newDogName;
		}
*/
	}

	public String getDogName() {
		return dogName;
	}

	void voice() {
		System.out.println(dogName + " " + this.dogName + " " + dogName + "!");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || this.getClass() != o.getClass())
			return false;
		Dog dog = (Dog) o;
		return Objects.equals(this.dogName, dog.dogName)
				&& Objects.equals(this.sex, dog.sex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dogName, sex);
	}
}
