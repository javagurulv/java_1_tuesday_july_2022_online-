package teacher.lesson_6_arrays_while_loop.lessoncode.validation;

public class PersonalDataDemo {

	public static void main(String[] args) {
		PersonalData data1 = new PersonalData(
			"Vasja",
			"Pupkin",
			"eddd@inbox.lv",
			"010199-10033"
		);

		PersonalData data2 = new PersonalData(
				null,
				"Pupkin",
				"eddd@inbox.lv",
				"010199-10033"
		);

		PersonalData data3 = new PersonalData(
				"Vasja",
				"Pupkin",
				"eddd@inbox.lv",
				null
		);

		PersonalData data4 = new PersonalData(
				null,
				"Pupkin",
				"eddd@inbox.lv",
				"010122"
		);


	}

}
