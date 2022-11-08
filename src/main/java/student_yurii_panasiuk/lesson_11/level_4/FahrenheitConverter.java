package student_yurii_panasiuk.lesson_11.level_4;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return ((celsiusTemperature * 1.8) + 32);
    }
}

// тесты через JUnit