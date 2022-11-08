package teacher.lesson_x.nhl.code;

import java.util.Date;

public class NhlGame {

	private Date gameDate;
	private String visitorTeam;

	private int visitorGoal;
	private String homeTeam;
	private int homeGoal;
	private String winStage;

	public NhlGame(Date gameDate,
				   String visitorTeam,
				   int visitorGoal,
				   String homeTeam,
				   int homeGoal,
				   String winStage) {
		this.gameDate = gameDate;
		this.visitorTeam = visitorTeam;
		this.homeTeam = homeTeam;
		this.visitorGoal = visitorGoal;
		this.homeGoal = homeGoal;
		this.winStage = winStage;
	}

	public Date getGameDate() {
		return gameDate;
	}

	public String getVisitorTeam() {
		return visitorTeam;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public int getVisitorGoal() {
		return visitorGoal;
	}

	public int getHomeGoal() {
		return homeGoal;
	}

	public String getWinStage() {
		return winStage;
	}
}
