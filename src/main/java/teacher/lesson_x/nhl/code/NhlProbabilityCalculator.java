package teacher.lesson_x.nhl.code;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NhlProbabilityCalculator {

	public void calculateLoseProbability(Set<NhlTeam> teams) {
		double loseAfter2Win = calculateLoseProbability(2, teams);
		double loseAfter3Win = calculateLoseProbability(3, teams);
		double loseAfter4Win = calculateLoseProbability(4, teams);
		double loseAfter5Win = calculateLoseProbability(5, teams);
		double loseAfter6Win = calculateLoseProbability(6, teams);
		double loseAfter7Win = calculateLoseProbability(7, teams);
		double loseAfter8Win = calculateLoseProbability(8, teams);
		double loseAfter9Win = calculateLoseProbability(9, teams);
		double loseAfter10Win = calculateLoseProbability(10, teams);
		System.out.println("LoseAfter 2 win = " + loseAfter2Win);
		System.out.println("LoseAfter 3 win = " + loseAfter3Win);
		System.out.println("LoseAfter 4 win = " + loseAfter4Win);
		System.out.println("LoseAfter 5 win = " + loseAfter5Win);
		System.out.println("LoseAfter 6 win = " + loseAfter6Win);
		System.out.println("LoseAfter 7 win = " + loseAfter7Win);
		System.out.println("LoseAfter 8 win = " + loseAfter8Win);
		System.out.println("LoseAfter 9 win = " + loseAfter9Win);
		System.out.println("LoseAfter 10 win = " + loseAfter10Win);
	}

	public void calculateWinProbability(Set<NhlTeam> teams) {
		double winAfter2Lose = calculateWinProbability(2, teams);
		double winAfter3Lose = calculateWinProbability(3, teams);
		double winAfter4Lose = calculateWinProbability(4, teams);
		double winAfter5Lose = calculateWinProbability(5, teams);
		double winAfter6Lose = calculateWinProbability(6, teams);
		double winAfter7Lose = calculateWinProbability(7, teams);
		double winAfter8Lose = calculateWinProbability(8, teams);
		double winAfter9Lose = calculateWinProbability(9, teams);
		double winAfter10Lose = calculateWinProbability(10, teams);
		System.out.println("WinAfter 2 lose = " + winAfter2Lose);
		System.out.println("WinAfter 3 lose = " + winAfter3Lose);
		System.out.println("WinAfter 4 lose = " + winAfter4Lose);
		System.out.println("WinAfter 5 lose = " + winAfter5Lose);
		System.out.println("WinAfter 6 lose = " + winAfter6Lose);
		System.out.println("WinAfter 7 lose = " + winAfter7Lose);
		System.out.println("WinAfter 8 lose = " + winAfter8Lose);
		System.out.println("WinAfter 9 lose = " + winAfter9Lose);
		System.out.println("WinAfter 10 lose = " + winAfter10Lose);
	}

	private double calculateWinProbability(int loseCount, Set<NhlTeam> teams) {
		int loseStreakSameAndLargerSize = teams.stream()
				.map(team -> calculateLossesStreakCount(loseCount, team))
				.reduce(0, Integer::sum);

		int loseStreakSameSize = teams.stream()
				.map(team -> team.getBarometerLine().stream()
						.filter(barometer -> barometer == -1 * loseCount)
						.toList().size())
				.reduce(0, Integer::sum);

		return (double) loseStreakSameSize / (double) loseStreakSameAndLargerSize;
	}


	private double calculateLoseProbability(int winCount, Set<NhlTeam> teams) {
		int winStreakSameAndLargerSize = teams.stream()
				.map(team -> calculateWinStreakCount(winCount, team))
				.reduce(0, Integer::sum);

		int winStreakSameSize = teams.stream()
				.map(team -> team.getBarometerLine().stream()
						.filter(barometer -> barometer == winCount)
						.toList().size())
				.reduce(0, Integer::sum);
		return (double) winStreakSameSize / (double) winStreakSameAndLargerSize;
	}

	private int calculateLossesStreakCount(int size, NhlTeam team) {
		return team.getBarometerLine().stream()
				.filter(barometer -> barometer <= -1 * size)
				.toList().size();
	}

	private int calculateWinStreakCount(int size, NhlTeam team) {
		return team.getBarometerLine().stream()
				.filter(barometer -> barometer >= size)
				.toList().size();
	}

}
