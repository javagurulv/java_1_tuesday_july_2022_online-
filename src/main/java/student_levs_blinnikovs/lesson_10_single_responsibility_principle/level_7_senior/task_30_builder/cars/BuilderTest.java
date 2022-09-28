package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class BuilderTest {

    public static void main(String[] args) {
        BuilderTest test = new BuilderTest();
        test.shouldCreateCar();
        test.shouldCreatePorsche911();
    }

    void shouldCreateCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeCar(carBuilder, 1991);
        Car realCar = carBuilder.getResult();
        Car expectedCar = new Car(1991);
        printTestResult(expectedCar.equals(realCar));
    }

    void shouldCreatePorsche911() {
        Director director = new Director();
        Porsche911Builder porsche911Builder = new Porsche911Builder();
        director.makePorsche911(porsche911Builder, 2000, 250);
        Porsche911 realPorsche911 = porsche911Builder.getResult();
        Porsche911 expectedPorsche911 = new Porsche911(2000, 250);
        printTestResult(expectedPorsche911.equals(realPorsche911));
    }

}
