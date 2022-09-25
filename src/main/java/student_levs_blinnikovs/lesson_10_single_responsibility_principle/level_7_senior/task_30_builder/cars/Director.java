package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class Director {

    void makeCar(CarBuilder carBuilder) {
        carBuilder.reset();
        carBuilder.setReleaseYear(1991);
        carBuilder.setTopSpeed(180);
    }

    void makePorsche911(Porsche911Builder porsche911Builder) {
        porsche911Builder.reset();
        porsche911Builder.setReleaseYear(2000);
        porsche911Builder.setTopSpeed(250);
    }

}
