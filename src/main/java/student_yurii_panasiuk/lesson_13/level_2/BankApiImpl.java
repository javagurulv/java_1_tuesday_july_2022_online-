package student_yurii_panasiuk.lesson_13.level_2;

import java.util.List;
import java.util.Optional;

class BankApiImpl implements BankApi {

    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    public Optional<BankClient> findByUid(UserCredentials credentials,String uid) throws AccessDeniedException {
    Optional<BankClient> detectedClient = Optional.empty();
          if ( !clients.isEmpty() && credentials.hasRole(Role.CAN_SEARCH_CLIENTS)){
            for (BankClient client :  clients) {
                if (client.getUid().equals(uid)) {
                    detectedClient = Optional.of(client);
                    return detectedClient; // нашел - пусть выходит
                }
            }
          }
          else {throw new AccessDeniedException();}
    return detectedClient;
    }
}
