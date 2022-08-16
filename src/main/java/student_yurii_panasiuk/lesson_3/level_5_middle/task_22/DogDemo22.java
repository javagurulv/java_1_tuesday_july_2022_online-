package student_yurii_panasiuk.lesson_3.level_5_middle.task_22;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
 class DogDemo22 {

    public static void main(String[] args){

        DogTask22 dogTask22 = new DogTask22("Bobik",2, "red");
        dogTask22.voice();
        dogTask22.changeColor("blue");
        dogTask22.voice();

    }

}
