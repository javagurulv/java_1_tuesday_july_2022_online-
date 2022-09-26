package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class BuilderTest {

    void shouldCreateCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        director.makeCar(carBuilder, 1991);
        Car realCar = carBuilder.getResult();
        Car expectedCar = new Car(1991);
        printTest(expectedCar.equals(realCar));
    }

    void shouldCreatePorsche911() {
        Director director = new Director();
        Porsche911Builder porsche911Builder = new Porsche911Builder();
        director.makePorsche911(porsche911Builder, 2000, 250);
        Porsche911 realPorsche911 = porsche911Builder.getResult();
        Porsche911 expectedPorsche911 = new Porsche911(2000, 250);
        printTest(expectedPorsche911.equals(realPorsche911));
    }


    void printTest(boolean isTestOK) {
        if (isTestOK) {
            System.out.println("Test OK");
        } else {
            System.out.println("Test NOT OK!");
        }
    }


    public static void main(String[] args) {

        BuilderTest test = new BuilderTest();

        test.shouldCreateCar();
        test.shouldCreatePorsche911();

    }

}
