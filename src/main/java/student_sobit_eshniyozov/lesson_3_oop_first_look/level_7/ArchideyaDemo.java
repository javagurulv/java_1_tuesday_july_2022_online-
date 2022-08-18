package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

// poka v stadiee razrabotki poka mojno ne proveryat!
public class ArchideyaDemo {
    public static void main(String[] args) {
        Archideya flower1 = new Archideya("Schilleriana", 15, 6, 2);
        Archideya flower2 = new Archideya("Vanda",12,4,1.5);

        System.out.println("\n"+"===========================");

        flower1.parameters();
        System.out.println("\n"+"---------------------------");
        flower2.parameters();
        System.out.println("\n"+"---------------------------");
        flower1.halfAYearLater(); flower2.halfAYearLater();
        flower1.halfAYearLater(); flower2.halfAYearLater();
        flower1.halfAYearLater(); flower2.halfAYearLater();

        System.out.println("\n"+"===========================");
        flower1.parameters();
        System.out.println("\n"+"---------------------------");
        flower2.parameters();
        System.out.println("\n"+"---------------------------");
    }
}

