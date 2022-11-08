package teacher.lesson_x.nhl.code;

import java.util.List;
import java.util.Set;

public class NhlSeason {

	private int year;
	private List<NhlGame> games;
	private Set<NhlTeam> teams;

	public NhlSeason(int year,
					 List<NhlGame> games,
					 Set<NhlTeam> teams) {
		this.year = year;
		this.games = games;
		this.teams = teams;
	}

	public int getYear() {
		return year;
	}

	public List<NhlGame> getGames() {
		return games;
	}

	public Set<NhlTeam> getTeams() {
		return teams;
	}

}
