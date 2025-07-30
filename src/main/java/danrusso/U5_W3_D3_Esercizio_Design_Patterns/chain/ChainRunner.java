package danrusso.U5_W3_D3_Esercizio_Design_Patterns.chain;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Soldier tenente = new Soldier(Gradi.TENENTE, 1000);
        Soldier capitano = new Soldier(Gradi.CAPITANO, 2000);
        Soldier maggiore = new Soldier(Gradi.MAGGIORE, 3000);
        Soldier colonnello = new Soldier(Gradi.COLONNELLO, 4000);
        Soldier generale = new Soldier(Gradi.GENERALE, 5000);

        tenente.setNext(capitano);
        capitano.setNext(maggiore);
        maggiore.setNext(colonnello);
        colonnello.setNext(generale);
        tenente.atLeastThisMuch(7000);
    }


}
