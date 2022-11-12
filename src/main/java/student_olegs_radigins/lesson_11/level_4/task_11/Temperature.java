package student_olegs_radigins.lesson_11.level_4.task_11;

class Temperature {
    private String type;
    private double temp;

    public Temperature(String type, double temp) {
        this.type = type;
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public double getTemp() {
        return temp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
}
