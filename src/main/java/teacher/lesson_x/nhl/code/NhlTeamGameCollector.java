package teacher.lesson_x.nhl.code;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NhlTeamGameCollector {

	public List<NhlGame> collectHomeGames(String teamName,
										  List<NhlGame> games) {
		return games.stream()
				.filter(game -> game.getHomeTeam().equals(teamName))
				.sorted(Comparator.comparing(NhlGame::getGameDate))
				.collect(Collectors.toList());
	}

	public List<NhlGame> collectAwayGames(String teamName,
										  List<NhlGame> games) {
		return games.stream()
				.filter(game -> game.getVisitorTeam().equals(teamName))
				.sorted(Comparator.comparing(NhlGame::getGameDate))
				.collect(Collectors.toList());
	}

	public List<NhlGame> collectAllGames(String teamName,
										 List<NhlGame> games) {
		return games.stream()
				.filter(game -> game.getVisitorTeam().equals(teamName)
						|| game.getHomeTeam().equals(teamName))
				.sorted(Comparator.comparing(NhlGame::getGameDate))
				.collect(Collectors.toList());
	}

}
