package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class BuilderDemo {

    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeCar(carBuilder, 1991);
        Car car = carBuilder.getResult();
        System.out.println(car);

        Porsche911Builder porsche911Builder = new Porsche911Builder();
        director.makePorsche911(porsche911Builder, 2000, 250);
        Porsche911 porsche911 = porsche911Builder.getResult();
        System.out.println(porsche911);

    }

}
