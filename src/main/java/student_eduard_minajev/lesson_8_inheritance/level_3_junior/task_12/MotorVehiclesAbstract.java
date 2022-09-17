package student_eduard_minajev.lesson_8_inheritance.level_3_junior.task_12;

public abstract class MotorVehiclesAbstract {

    private String carType;

    private String carClass;

    private int enginePowerInHP;


    public MotorVehiclesAbstract (String carType, String carClass, int enginePower){
        this.carType = carType;
        this.carClass = carClass;
        this.enginePowerInHP = enginePower;
    }
}
