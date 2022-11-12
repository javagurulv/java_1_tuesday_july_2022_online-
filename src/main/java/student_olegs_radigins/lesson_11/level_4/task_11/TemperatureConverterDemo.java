package student_olegs_radigins.lesson_11.level_4.task_11;

class TemperatureConverterDemo {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter = new TemperatureConverter();
        Temperature temperature = new Temperature("C",10);
        temperatureConverter.convertToFahrenheit(temperature);
        System.out.println(temperature.getTemp() + temperature.getType());
        temperatureConverter.convertToKelvin(temperature);
        System.out.println(temperature.getTemp() + temperature.getType());
        temperatureConverter.convertToFahrenheit(temperature);
        System.out.println(temperature.getTemp() + temperature.getType());
    }
}
