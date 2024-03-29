package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class CarBuilder implements Builder {

    private Car car;

    @Override
    public void reset() {
        car = new Car(0);
    }

    @Override
    public void setReleaseYear(int releaseYear) {
        car.setReleaseYear(releaseYear);
    }

    public Car getResult() {
        return car;
    }
}
