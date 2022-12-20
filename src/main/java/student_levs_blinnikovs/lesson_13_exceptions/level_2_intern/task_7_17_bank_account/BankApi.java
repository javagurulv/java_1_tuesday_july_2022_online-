package student_levs_blinnikovs.lesson_13_exceptions.level_2_intern.task_7_17_bank_account;

import java.util.Optional;

interface BankApi {

    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;

}
