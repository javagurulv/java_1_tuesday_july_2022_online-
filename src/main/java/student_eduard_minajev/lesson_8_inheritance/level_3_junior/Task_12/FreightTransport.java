package student_eduard_minajev.lesson_8_inheritance.level_3_junior.Task_12;

public class FreightTransport extends MotorVehiclesAbstract {

    private double cargoCapacityInKg;

    private boolean isPrivateProperty;

    public FreightTransport (String carType, String carClass, int enginePower, int cargoCapacity, boolean isPrivateProperty){
        super(carType, carClass, enginePower);
        this.cargoCapacityInKg = cargoCapacity;
        this.isPrivateProperty = isPrivateProperty;
    }

}
