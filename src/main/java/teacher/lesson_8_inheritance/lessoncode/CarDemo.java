package teacher.lesson_8_inheritance.lessoncode;

public class CarDemo {

	public static void main(String[] args) {

		//Car car = new Car();

		ElectricCar electricCar = new ElectricCar("Tesla 3", 100);
		//PetrolCar petrolCar = new PetrolCar("Ferrary Monza");

		Car car1 = electricCar;
		//Car car2 = petrolCar;

		car1.start();
		//car2.start();


		/*Car car = new Car("Nissan");
		car.start();
		car.stop();*/

	}

}
