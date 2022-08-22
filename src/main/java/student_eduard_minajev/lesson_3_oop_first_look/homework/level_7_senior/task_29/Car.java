package student_eduard_minajev.lesson_3_oop_first_look.homework.level_7_senior.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class Car {

     String brandName;

     String model;

     double odoReading;

     double fuelReading;

     double fuelConsumptionRate;

     Car (String brandName, String model, double odoReading, double fuelReading, double fuelConsumptionRate) {
         this.brandName=brandName;
         this.model=model;
         this.odoReading=odoReading;
         this.fuelReading=fuelReading;
         this.fuelConsumptionRate=fuelConsumptionRate;
     }

     void getCarBrand (){
         System.out.println(brandName);

     }

     void nameCarBrand (){
         System.out.println(brandName);
     }

     void getModel (){
         System.out.println(model);
     }


     void getOdoReading (){
         System.out.println(odoReading);
     }

     void getFuelReading (){
         System.out.println(fuelReading);
     }

     void drive100KM (){
         this.odoReading=odoReading + 100;
         this.fuelReading=fuelReading - fuelConsumptionRate;
         System.out.println(odoReading + fuelReading);
     }

}
