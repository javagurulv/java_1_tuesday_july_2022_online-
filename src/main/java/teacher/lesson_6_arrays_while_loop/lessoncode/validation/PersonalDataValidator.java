package teacher.lesson_6_arrays_while_loop.lessoncode.validation;

import java.util.ArrayList;
import java.util.List;

class PersonalDataValidator {

	public List<Error> validate(PersonalData data) {
		List<Error> errors = new ArrayList<>();
		validateFirstName(data, errors);
		validateLastName(data, errors);
		validateEmail(data, errors);
		validatePersonalCode(data, errors);
		validatePersonalCodeLength(data, errors);
		return errors;
	}

	private void validateFirstName(PersonalData data, List<Error> errors) {
		if (data.getFirstName() == null) {
			Error error = new Error("firstName", "Must not be null!");
			errors.add(error);
		}
	}

	private void validateLastName(PersonalData data, List<Error> errors) {
		if (data.getLastName() == null) {
			Error error = new Error("lastName", "Must not be null!");
			errors.add(error);
		}
	}

	private void validatePersonalCodeLength(PersonalData data, List<Error> errors) {
		if (data.getPersonalCode() != null
				&& data.getPersonalCode().length() != 12) {
			Error error = new Error("personalCode", "Must contains 12 chars!");
			errors.add(error);
		}
	}

	private void validatePersonalCode(PersonalData data, List<Error> errors) {
		if (data.getPersonalCode() == null) {
			Error error = new Error("personalCode", "Must not be null");
			errors.add(error);
		}
	}

	private void validateEmail(PersonalData data,
							   List<Error> errors) {
		if (data.getEmail() != null
			&& !data.getEmail().contains("@")) {
			Error error = new Error("email", "Must contains @!");
			errors.add(error);
		}
	}

}
