package student_yurii_panasiuk.lesson_13.level_2;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BankApiImplTest extends TestCase {

    BankClient client1 =  new BankClient("one", "Bashful");
    BankClient client2 =  new BankClient("two", "Doc");
    BankClient client3 =  new BankClient("three", "Dopey");
    BankClient client4 =  new BankClient("four", "Grumpy");
    BankClient client5 =  new BankClient("five", "Happy");
    BankClient client6 =  new BankClient("six", "Sleepy");
    BankClient client7 =  new BankClient("seven", "Sneezy");



    public void testFindByUid() throws AccessDeniedException {

        List<BankClient> testCientsList = new ArrayList<>();
        testCientsList.add(client1);
        testCientsList.add(client2);
        testCientsList.add(client3);
        testCientsList.add(client4);
        testCientsList.add(client5);
        testCientsList.add(client6);
        testCientsList.add(client7);

        List<Role> testCredentials1 = List.of(Role.CAN_SEARCH_CLIENTS);
        List<Role> testCredentials2 = List.of();

        UserCredentials acsessAllowed = new UserCredentials(testCredentials1);
        UserCredentials acsessNotAllowed = new UserCredentials(testCredentials2);

        BankApiImpl test = new BankApiImpl(testCientsList);

        assertEquals(test.findByUid(acsessAllowed, "one"), Optional.of(client1));
        assertNotSame(test.findByUid(acsessAllowed, "one"), Optional.of(client2));
        assertEquals(test.findByUid(acsessAllowed, "eight"),Optional.empty());
    }
}