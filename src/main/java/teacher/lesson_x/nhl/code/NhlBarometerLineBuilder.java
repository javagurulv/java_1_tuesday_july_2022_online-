package teacher.lesson_x.nhl.code;

import java.util.ArrayList;
import java.util.List;

public class NhlBarometerLineBuilder {

	public List<Integer> build(List<Integer> winLoseLine) {
		List<Integer> barometerLine = new ArrayList<>();
		int winCount = 0;
		int losesCount = 0;
		for(int i = 0; i < winLoseLine.size(); i++) {
			int gameResult = winLoseLine.get(i);
			if (gameResult == 1) {
				if (losesCount > 0) barometerLine.add(-1 * losesCount);
				winCount++;
				losesCount = 0;
			} else {
				if (winCount > 0) barometerLine.add(winCount);
				winCount = 0;
				losesCount++;
			}
		}
		return barometerLine;
	}

}
