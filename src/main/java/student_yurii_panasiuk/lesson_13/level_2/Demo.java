package student_yurii_panasiuk.lesson_13.level_2;

import java.util.ArrayList;
import java.util.List;

class Demo {

     public static void main(String[] args) throws AccessDeniedException {

         BankClient client1 =  new BankClient("one", "Bashful");
         BankClient client2 =  new BankClient("two", "Doc");
         BankClient client3 =  new BankClient("three", "Dopey");
         BankClient client4 =  new BankClient("four", "Grumpy");
         BankClient client5 =  new BankClient("five", "Happy");
         BankClient client6 =  new BankClient("six", "Sleepy");
         BankClient client7 =  new BankClient("seven", "Sneezy");

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
         System.out.println(test.findByUid(acsessAllowed, "four"));
         test.findByUid(acsessNotAllowed, "four");
     }


}
