package teacher.lesson_x.nhl.code;

import java.util.List;
import java.util.Objects;

public class NhlTeam {

	private String title;

	private List<NhlGame> allGames;
	private List<NhlGame> homeGames;
	private List<NhlGame> awayGames;
	private List<Integer> winLoseLine;
	private List<Integer> barometerLine;

	public NhlTeam(String title,
				   List<NhlGame> allGames,
				   List<NhlGame> homeGames,
				   List<NhlGame> awayGames,
				   List<Integer> winLoseLine,
				   List<Integer> barometerLine) {
		this.title = title;
		this.allGames = allGames;
		this.homeGames = homeGames;
		this.awayGames = awayGames;
		this.winLoseLine = winLoseLine;
		this.barometerLine = barometerLine;
	}

	public String getTitle() {
		return title;
	}

	public List<NhlGame> getAllGames() {
		return allGames;
	}

	public List<NhlGame> getHomeGames() {
		return homeGames;
	}

	public List<NhlGame> getAwayGames() {
		return awayGames;
	}

	public List<Integer> getWinLoseLine() {
		return winLoseLine;
	}

	public List<Integer> getBarometerLine() {
		return barometerLine;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		NhlTeam nhlTeam = (NhlTeam) o;
		return Objects.equals(title, nhlTeam.title);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

}
