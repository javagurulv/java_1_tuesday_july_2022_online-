package student_levs_blinnikovs.lesson_13_exceptions.level_2_intern.task_7_x_bank_account;

import java.util.List;

class BankApiImplTest {
    public static void main(String[] args) {
        BankApiImplTest test = new BankApiImplTest();
        test.shouldNotThrowExceptionWithProperRoles();
        test.shouldThrowExceptionWithoutProperRoles();
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
