package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

import teacher.codereview.CodeReview;

@CodeReview(approved = false)
class ArchideyaDemo {
    public static void main(String[] args) {
        Archideya flower1 = new Archideya("Schilleriana", 15, 6, 2);
        Archideya flower2 = new Archideya("Vanda",12,4,1.5);

        Archideya[] allArchideya = {flower1, flower2};
        Archideya test = new Archideya(allArchideya);

        System.out.println("\n"+"===========================");

        flower1.parameters();
        System.out.println("\n"+"---------------------------");
        flower2.parameters();
        System.out.println("\n"+"---------------------------");
        test.halfAYearLaterForAll();
        test.halfAYearLaterForAll();
        test.halfAYearLaterForAll();

        System.out.println("\n"+"===========================");
        flower1.parameters();
        System.out.println("\n"+"---------------------------");
        flower2.parameters();
        System.out.println("\n"+"---------------------------");
    }
}

