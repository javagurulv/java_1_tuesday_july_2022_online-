package student_olegs_radigins.lesson_11.level_4.task_11;

class TemperatureConverter {

    void convertToFahrenheit(Temperature temperature){
        if (temperature.getType().equals("C")) {
            temperature.setTemp(((temperature.getTemp()) * 1.8) + 32);
        } else {
            temperature.setTemp((((temperature.getTemp())- 273.15) * 1.8) + 32 );
        }
        temperature.setType("F");

    }
    void convertToKelvin(Temperature temperature){
        if (temperature.getType().equals("C")){
            temperature.setTemp(temperature.getTemp() + 273.15);
        } else  {
            temperature.setTemp((temperature.getTemp()-32)/1.8+ 273.15);
        }
        temperature.setType("K");
    }


}
