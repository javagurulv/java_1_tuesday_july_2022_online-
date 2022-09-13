package teacher.lesson_13_exceptions.lessoncode;

import java.util.Optional;

public class BankApiV3 {

	public Optional<String> getClientFullName(String sequrityKey, Long clientId) {
		if (sequrityKey == null || !sequrityKey.equals("abcd")) {
			AccessDeniedUnchekedException exception = new AccessDeniedUnchekedException("Invalid sequrity key", sequrityKey);
			throw exception;
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();  // return "";
		}
	}

	public static void main(String[] args) {
			BankApiV3 bankApi = new BankApiV3();
			Optional<String> result = bankApi.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
	}

}
