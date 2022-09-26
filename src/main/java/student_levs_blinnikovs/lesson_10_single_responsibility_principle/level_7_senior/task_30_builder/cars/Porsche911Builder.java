package student_levs_blinnikovs.lesson_10_single_responsibility_principle.level_7_senior.task_30_builder.cars;

class Porsche911Builder implements Builder {

    private Porsche911 porsche911;

    @Override
    public void reset() {
        porsche911 = new Porsche911(0, 0);
    }

    @Override
    public void setReleaseYear(int releaseYear) {
        porsche911.setReleaseYear(releaseYear);
    }

    public void setTopSpeed(int topSpeed) {
        porsche911.setTopSpeed(topSpeed);
    }

    public Porsche911 getResult() {
        return porsche911;
    }
}
