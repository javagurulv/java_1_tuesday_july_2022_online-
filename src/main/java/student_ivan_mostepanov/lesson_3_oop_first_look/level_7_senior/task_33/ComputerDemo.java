package student_ivan_mostepanov.lesson_3_oop_first_look.level_7_senior.task_33;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ComputerDemo {

    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }


}
