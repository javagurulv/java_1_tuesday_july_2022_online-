package student_levs_blinnikovs.lesson_13_exceptions.level_2_intern.task_7_x_bank_account;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        Optional<BankClient> searchResult = Optional.empty();
        if (!credentials.getRoles().contains(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException();
        }
        for (BankClient client : clients) {
           if (client.getUid().equals(uid)) {
                searchResult = Optional.of(client);
           }
        }
        return searchResult;
    }
}
