package danrusso.U5_W3_D3_Esercizio_Design_Patterns.adapterEs;

import java.time.LocalDate;

public class Info {
    private String name;
    private String surname;
    private LocalDate DOB;

    public Info(String name, String surname, LocalDate DOB) {
        this.name = name;
        this.surname = surname;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

}
