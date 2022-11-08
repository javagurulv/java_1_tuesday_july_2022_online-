package teacher.lesson_x.nhl.code;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NhlGameFileReader {

	public List<NhlGame> readFile(String filePath) {
		List<NhlGame> games = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File(filePath))) {
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				games.add(getRecordFromLine(scanner.nextLine()));
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
		return games;
	}

	private NhlGame getRecordFromLine(String line) {
		List<String> values = new ArrayList<String>();
		try (Scanner rowScanner = new Scanner(line)) {
			rowScanner.useDelimiter(",");
			while (rowScanner.hasNext()) {
				values.add(rowScanner.next());
			}
		}
		return new NhlGame(
				convertToDate(values.get(0)),
				values.get(1),
				Integer.parseInt(values.get(2)),
				values.get(3),
				Integer.parseInt(values.get(4)),
				values.get(5)
		);
	}

	private Date convertToDate(String gameDate) {
		try {
			return new SimpleDateFormat("yyyy-MM-dd").parse(gameDate);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

}
