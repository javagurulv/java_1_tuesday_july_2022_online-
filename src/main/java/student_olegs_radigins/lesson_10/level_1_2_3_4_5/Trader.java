package student_olegs_radigins.lesson_10.level_1_2_3_4_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Trader {
    private String fullName;
    private String city;
    private String country;


    public Trader(String fullName, String city, String country) {
        this.fullName = fullName;
        this.city = city;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}
