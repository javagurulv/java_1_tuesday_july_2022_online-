package student_levs_blinnikovs.lesson_13_exceptions.level_2_intern.task_7_17_bank_account;

import java.util.List;
import java.util.Optional;

import static student_levs_blinnikovs.personal.test_utils.TestUtil.printTestResult;

class BankApiImplTest {
    public static void main(String[] args) throws AccessDeniedException {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldFindByIdSmoke();
        test.shouldNotFindNonExistingByIdSmoke();
        test.shouldNotThrowExceptionWithProperRoles();
        test.shouldThrowExceptionWithoutProperRoles();
    }

    void shouldFindByIdSmoke() throws AccessDeniedException {
        BankClient client1 = new BankClient("1", "Levs");

        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);

        List<BankClient> bankClients = List.of(client1);

        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl api = new BankApiImpl(bankClients);
        Optional<BankClient> expectedBankClient = Optional.of(client1);
        Optional<BankClient> realBankClient = api.findByUid(userCredentials, "1");

        printTestResult(realBankClient.equals(expectedBankClient), "Should find by id");
    }

    void shouldNotFindNonExistingByIdSmoke() throws AccessDeniedException {
        BankClient client1 = new BankClient("1", "Levs");

        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);

        List<BankClient> bankClients = List.of(client1);

        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl api = new BankApiImpl(bankClients);
        Optional<BankClient> expectedBankClient = Optional.of(client1);
        Optional<BankClient> realBankClient = api.findByUid(userCredentials, "2");

        printTestResult(!realBankClient.equals(expectedBankClient), "Should not find non existing by id");
    }

    void shouldNotThrowExceptionWithProperRoles() {
        BankClient client1 = new BankClient("1", "Levs");

        List<Role> roles = List.of(Role.CAN_SEARCH_CLIENTS);

        List<BankClient> bankClients = List.of(client1);

        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl api = new BankApiImpl(bankClients);

        try {
            api.findByUid(userCredentials, "1");
            System.out.println("TEST OK - Shouldn't throw AccessDeniedException WITH proper roles and didn't.");
        } catch (AccessDeniedException e) {
            System.out.println("TEST NOT OK - Should not throw AccessDeniedException WITH proper roles but did.");
        }
    }

    void shouldThrowExceptionWithoutProperRoles() {
        BankClient client1 = new BankClient("1", "Levs");

        List<Role> roles = List.of();

        List<BankClient> bankClients = List.of(client1);

        UserCredentials userCredentials = new UserCredentials(roles);
        BankApiImpl api = new BankApiImpl(bankClients);

        try {
            api.findByUid(userCredentials, "1");
            System.out.println("TEST NOT OK - Didn't throw AccessDeniedException WITH NOT proper roles but had to.");
        } catch (AccessDeniedException e) {
            System.out.println("TEST OK - Did throw AccessDeniedException WITH NOT proper roles.");
        }

    }

}
