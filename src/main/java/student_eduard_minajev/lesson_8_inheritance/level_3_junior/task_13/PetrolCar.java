package student_eduard_minajev.lesson_8_inheritance.level_3_junior.task_13;

public class PetrolCar extends Car {

    private double petrolTankCapacity;

    public PetrolCar (double petrolTankCapacity){
        super();
        this.petrolTankCapacity = petrolTankCapacity;
    }

    public void accelerate() {System.out.println("Gas! Gas! Gas! ");
    }

}
