package student_olegs_radigins.lesson_3.level7.task_29;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Bike {
    String type;
    int numberOfGears;
    String color;


    public Bike(String type, int numberOfGears, String color) {
        this.type = type;
        this.numberOfGears = numberOfGears;
        this.color = color;
    }

    void tellAbout(){
        System.out.println(type + " bike have " + numberOfGears + " gears.His color is " + color + ".");

    }


}
