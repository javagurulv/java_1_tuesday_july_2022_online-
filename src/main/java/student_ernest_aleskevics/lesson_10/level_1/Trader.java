package student_ernest_aleskevics.lesson_10.level_1;

public class Trader {

    private String fullName;
    private String city;

    Trader(String fullName, String city) {
        this.fullName = fullName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public String getFullName() {
        return fullName;
    }
}
