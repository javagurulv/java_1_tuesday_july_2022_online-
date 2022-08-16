package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_29;

class CarDemo {

    public static void main(String[] args){

      Car car1 = new Car("BMW", "M640",234223.54 , 47.32, 15.4);
      car1.getCarBrand();
      car1.getModel();
      car1.getOdoReading();
      car1.getFuelReading();
      car1.drive100KM();
      car1.getOdoReading();
      car1.getFuelReading();

      Car car2 = new Car ("Porsche", "Cayenne", 21455.23, 75.00, 18.3);
      car2.getCarBrand();
      car2.getModel();
      car2.getOdoReading();
      car2.getFuelReading();
      car2.drive100KM();
      car2.getOdoReading();
      car2.getFuelReading();





    }
}
