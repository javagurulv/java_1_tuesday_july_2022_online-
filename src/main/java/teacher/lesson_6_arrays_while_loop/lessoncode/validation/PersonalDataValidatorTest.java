package teacher.lesson_6_arrays_while_loop.lessoncode.validation;

import java.util.List;

class PersonalDataValidatorTest {

	public static void main(String[] args) {
		PersonalDataValidatorTest test = new PersonalDataValidatorTest();
		test.shouldReturnErrorWhenFirstNameIsNull();
		test.shouldReturnErrorWhenLastNameIsNull();


		// email not contains @
		// personalCode == null
		// personal code not 12 chars
		// happy path - vse ok! (with email)
		// happy path - vse ok! (without email)

	}

	private void shouldReturnErrorWhenFirstNameIsNull() {
		PersonalData data = new PersonalData(
				null,
				"Pupkin",
				"eddd@inbox.lv",
				"010199-10033"
		);

		PersonalDataValidator validator = new PersonalDataValidator();
		List<Error> errors = validator.validate(data);

		checkResult(errors.size() == 1, "firstName errors size");
		Error error = errors.get(0);
		checkResult(error.getField().equals("firstName"), "firstName error field");
		checkResult(error.getMessage().equals("Must not be null!"), "firstName error message");
	}

	private void shouldReturnErrorWhenLastNameIsNull() {
		PersonalData data = new PersonalData(
				"Vasja",
				null,
				"eddd@inbox.lv",
				"010199-10033"
		);

		PersonalDataValidator validator = new PersonalDataValidator();
		List<Error> errors = validator.validate(data);

		checkResult(errors.size() == 1, "lastName errors size");
		Error error = errors.get(0);
		checkResult(error.getField().equals("lastName"), "lastName error field");
		checkResult(error.getMessage().equals("Must not be null!"), "lastName error message");
	}

	private void checkResult(boolean result, String testName) {
		if (result) {
			System.out.println("TEST OK - " + testName);
		} else {
			System.out.println("TEST FAIL - " + testName);
		}
	}

}
