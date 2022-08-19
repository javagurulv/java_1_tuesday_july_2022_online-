package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

public class PlayersDemo {
    public static void main(String[] args) {
    Players player1 = new Players("Lionel","Barselona",10,200);
    Players player2 = new Players("Cristiano","Real Madrid",7,200);

        System.out.println("\n"+"===========================");

        player1.aboutPlayers();
        player1.scoreAGoal();
        player1.scoreAGoal();
        player1.seasonOfTransfer("PSG",30);
        System.out.println("\n"+"---------------------------");
        player1.aboutPlayers();
        player1.scoreAGoal();
        System.out.println("\n"+"---------------------------");
        player1.aboutPlayers();

        System.out.println("\n"+"===========================");

        player2.aboutPlayers();
        player2.scoreAGoal();
        player2.seasonOfTransfer("Juventus",7);
        System.out.println("\n"+"---------------------------");
        player2.aboutPlayers();
        player2.scoreAGoal();
        player2.scoreAGoal();
        System.out.println("\n"+"---------------------------");
        player2.aboutPlayers();
    }
}
