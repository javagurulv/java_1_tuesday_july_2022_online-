package student_eduard_minajev.lesson_8_inheritance.level_3_junior.task_13;

public class ElectricCar extends Car {

        private int batteryCharge;

        public ElectricCar (int batteryCharge){
                super();
                this.batteryCharge = batteryCharge;
        }

        public void accelerate () {System.out.println("Gas! Gas! Gas! ");
        }
}
