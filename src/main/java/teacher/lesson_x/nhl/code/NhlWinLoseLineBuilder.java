package teacher.lesson_x.nhl.code;

import java.util.ArrayList;
import java.util.List;

public class NhlWinLoseLineBuilder {

	public List<Integer> build(String teamName, List<NhlGame> games) {
		List<Integer> winLose = new ArrayList<>();
		for (int i = 0; i < games.size(); i++) {
			NhlGame game = games.get(i);
			if (game.getHomeTeam().equals(teamName)) {
				winLose.add(game.getHomeGoal() > game.getVisitorGoal() ? 1 : 0);
			}
			if (game.getVisitorTeam().equals(teamName)) {
				winLose.add(game.getHomeGoal() < game.getVisitorGoal() ? 1 : 0);
			}
		}
		return winLose;
	}

}
