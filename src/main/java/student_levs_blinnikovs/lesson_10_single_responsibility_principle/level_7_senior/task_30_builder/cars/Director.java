package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class Director {

    void makeCar(CarBuilder carBuilder, int releaseYear) {
        carBuilder.reset();
        carBuilder.setReleaseYear(releaseYear);
    }

    void makePorsche911(Porsche911Builder porsche911Builder, int releaseYear, int topSpeed) {
        porsche911Builder.reset();
        porsche911Builder.setReleaseYear(releaseYear);
        porsche911Builder.setTopSpeed(topSpeed);
    }

}
