package student_sobit_eshniyozov.lesson_3_oop_first_look.level_7;

class Players {
    String nameOfPlayer;
    String teamOfPlayer;
    int numberOfPlayer;
    int numberOfGoal;

    Players(String nameOfPlayer, String teamOfPlayer, int numberOfPlayer, int numberOfGoal){
        this.nameOfPlayer = nameOfPlayer;
        this.teamOfPlayer = teamOfPlayer;
        this.numberOfPlayer = numberOfPlayer;
        this.numberOfGoal = numberOfGoal;
    }
    void aboutPlayers(){
        System.out.println("Name of player: "+this.nameOfPlayer+"\nTeam of player: "+this.teamOfPlayer+"\nNumber of player: "+this.numberOfPlayer+"\nNumber of goals: "+this.numberOfGoal);
    }
    void scoreAGoal(){
        this.numberOfGoal=numberOfGoal+1;
        System.out.println(this.nameOfPlayer+" forgot the goal. GOAL!!! GOAL!!! GOAL!!!");
    }
    void seasonOfTransfer(String newTeamOfPlayer,int newNumberOfPlayer){
        this.teamOfPlayer=newTeamOfPlayer;
        this.numberOfPlayer=newNumberOfPlayer;
        System.out.println("During the transfer season player was transferred");

    }

}
