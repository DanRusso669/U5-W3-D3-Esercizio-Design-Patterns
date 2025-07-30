package danrusso.U5_W3_D3_Esercizio_Design_Patterns.adapterEs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Info myInfo = new Info("Mario", "Rossi", LocalDate.of(2000, 12, 12));

        InfoAdapter myInfoAdapter = new InfoAdapter(myInfo);

        UserData userData = new UserData(myInfoAdapter.getFullname(), myInfoAdapter.getAge());
        System.out.println(userData);
    }
}
