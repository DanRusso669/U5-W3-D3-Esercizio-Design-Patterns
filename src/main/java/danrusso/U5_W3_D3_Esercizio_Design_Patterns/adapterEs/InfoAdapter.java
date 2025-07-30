package danrusso.U5_W3_D3_Esercizio_Design_Patterns.adapterEs;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdapter implements DataSource {
    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getFullname() {
        return this.info.getName() + " " + this.info.getSurname();
    }

    @Override
    public int getAge() {
        return Period.between(this.info.getDOB(), LocalDate.now()).getYears();
    }
}
