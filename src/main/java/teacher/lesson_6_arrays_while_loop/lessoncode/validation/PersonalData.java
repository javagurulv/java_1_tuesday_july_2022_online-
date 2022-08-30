package teacher.lesson_6_arrays_while_loop.lessoncode.validation;

class PersonalData {

	private String firstName;
	private String lastName;
	private String email;
	private String personalCode;

	public PersonalData(String firstName,
						String lastName,
						String email,
						String personalCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.personalCode = personalCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPersonalCode() {
		return personalCode;
	}
}
