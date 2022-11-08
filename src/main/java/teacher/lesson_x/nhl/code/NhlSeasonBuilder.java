package teacher.lesson_x.nhl.code;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NhlSeasonBuilder {

	private NhlTeamGameCollector gameCollector = new NhlTeamGameCollector();
	private NhlWinLoseLineBuilder winLoseLineBuilder = new NhlWinLoseLineBuilder();
	private NhlBarometerLineBuilder barometerLineBuilder = new NhlBarometerLineBuilder();

	public NhlSeason build(int year, List<NhlGame> games) {
		Set<String> teamNames = getTeams(games);

		Set<NhlTeam> teams = teamNames.stream()
				.map(teamName -> {
					List<NhlGame> homeGames = gameCollector.collectHomeGames(teamName, games);
					List<NhlGame> awayGames = gameCollector.collectAwayGames(teamName, games);
					List<NhlGame> allGames = gameCollector.collectAllGames(teamName, games);
					List<Integer> winLoseLine = winLoseLineBuilder.build(teamName, allGames);
					List<Integer> barometerLine = barometerLineBuilder.build(winLoseLine);
					return new NhlTeam(teamName, allGames, homeGames, awayGames, winLoseLine, barometerLine);
				})
				.collect(Collectors.toSet());

		return new NhlSeason(year, games, teams);
	}

	private static Set<String> getTeams(List<NhlGame> games) {
		return games.stream()
				.map(NhlGame::getVisitorTeam)
				.collect(Collectors.toSet());
	}

}
