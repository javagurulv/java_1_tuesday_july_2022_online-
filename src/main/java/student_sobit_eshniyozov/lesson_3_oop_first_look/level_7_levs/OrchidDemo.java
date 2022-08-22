package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7_levs;

// poka v stadiee razrabotki poka mojno ne proveryat!
public class OrchidDemo {
    public static void main(String[] args) {
        Orchid flower1 = new Orchid("Schilleriana", 15, 6, 2);
        Orchid flower2 = new Orchid("Vanda",12,4,1.5);

        System.out.println("\n"+"===========================");

        flower1.printParameters();
        System.out.println("\n"+"---------------------------");

        flower2.printParameters();
        System.out.println("\n"+"---------------------------");  // тут добавил отступов для читабельности

        flower1.increaseAgeByHalfYear();                           // тут были вызовы методов в строчку. Так не пишут. Для лучшей читабельности всё со своей строки
        flower1.increaseAgeByHalfYear();
        flower1.increaseAgeByHalfYear();

        flower2.increaseAgeByHalfYear();
        flower2.increaseAgeByHalfYear();
        flower2.increaseAgeByHalfYear();

        System.out.println("\n"+"===========================");
        flower1.printParameters();

        System.out.println("\n"+"---------------------------");
        flower2.printParameters();

        System.out.println("\n"+"---------------------------");
    }
}

