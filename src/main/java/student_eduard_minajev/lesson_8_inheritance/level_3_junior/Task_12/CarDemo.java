package student_eduard_minajev.lesson_8_inheritance.level_3_junior.Task_12;

public class CarDemo {

    public static void main(String[] args) {
        PassengerVehicle vehicle1 = new PassengerVehicle("Regular Car","Four Door Sedan", 185,4, true);
        PassengerVehicle vehicle2 = new PassengerVehicle("Regular car","SUV",320, 6,true);
        PassengerVehicle vehicle3 = new PassengerVehicle("Bus","Coach",415,80,false);
        PassengerVehicle vehicle4 = new PassengerVehicle("Bus","City Bus",260,135,false);

       FreightTransport freightTransport1 = new FreightTransport("Light Truck", "Commercial Truck", 300, 800,true);
       FreightTransport freightTransport2 = new FreightTransport("Semi-Trailer","Commercial Truck,",630,8000,true);
       FreightTransport freightTransport3 = new FreightTransport("Dump-Truck","Service vehicle", 360,2300,false);

    }

}
