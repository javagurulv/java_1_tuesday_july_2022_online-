package student_eduard_minajev.lesson_8_inheritance.level_3_junior.Task_12;

public class PassengerVehicle extends MotorVehiclesAbstract {

    private int passengerCapacity;

    private boolean isPrivateProperty;


    public PassengerVehicle (String carType, String carClass, int enginePower, int passengerCapacity, boolean isPrivateProperty ) {
        super(carType, carClass, enginePower);
        this.passengerCapacity = passengerCapacity;
        this.isPrivateProperty = isPrivateProperty;
    }

}
