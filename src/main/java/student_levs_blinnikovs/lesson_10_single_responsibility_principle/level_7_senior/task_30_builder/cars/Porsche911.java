package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class Porsche911 extends Car {

    private int topSpeed;

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Porsche911{" +
                "topSpeed=" + topSpeed +
                ", releaseYear=" + super.getReleaseYear() +
                '}';
    }
}