package teacher.lesson_9_objects_equality.lessoncode;

class Car {

	protected boolean isSwithedOn;
	private double fuel;

	private Car(double fuel) {
		this.fuel = fuel;
	}

	public Car(boolean isSwithedOn, double fuel) {
		this(fuel);
		this.isSwithedOn = isSwithedOn;
	}

	// Car = {isSwitchedOn = true, fuel = 0.0}
	@Override
	public String toString() {
		return "Car = {"
			+ "isSwitchedOn = " + this.isSwithedOn + ", "
			+ "fuel = " + this.fuel
			+ "}";
	}

	protected boolean haveFuel() {
		return fuel > 0;
	}

	public void start() {
		if (haveFuel()) {
			this.isSwithedOn = true;
			System.out.println("Can started!");
		} else {
			System.out.println("Can not start!");
		}
	}

	public boolean isSwithedOn() {
		return this.isSwithedOn;
	}

}
