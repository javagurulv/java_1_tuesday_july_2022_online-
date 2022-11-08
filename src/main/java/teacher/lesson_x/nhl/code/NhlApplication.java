package teacher.lesson_x.nhl.code;

import java.util.List;
import java.util.stream.Collectors;

public class NhlApplication {

	public static void main(String[] args) {
		NhlGameFileReader fileReader = new NhlGameFileReader();
		NhlSeasonBuilder seasonBuilder = new NhlSeasonBuilder();
		NhlProbabilityCalculator probabilityCalculator = new NhlProbabilityCalculator();

		List<NhlGame> games = fileReader.readFile(
			"C:\\ProofIT\\javaguru\\java_1_tuesday_july_2022_online-\\src\\main\\java\\teacher\\lesson_x\\nhl\\data\\2016.csv"
		);

		NhlSeason season = seasonBuilder.build(2010, games);

		season.getTeams().forEach(team -> {
			String winLoseLine = team.getWinLoseLine().stream()
					.map(winLose -> "" + winLose)
					.collect(Collectors.joining(","));
			System.out.println(team.getTitle() + " - winLoseLine = " + winLoseLine);

			String barometerLine = team.getBarometerLine().stream()
					.map(barometer -> "" + barometer)
					.collect(Collectors.joining(","));
			System.out.println(team.getTitle() + " - barometer = " + barometerLine);

		});


		probabilityCalculator.calculateLoseProbability(season.getTeams());
		probabilityCalculator.calculateWinProbability(season.getTeams());

	}

}
