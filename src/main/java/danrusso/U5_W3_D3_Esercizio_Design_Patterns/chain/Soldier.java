package danrusso.U5_W3_D3_Esercizio_Design_Patterns.chain;

public class Soldier {
    private Gradi role;
    private int wage;

    public Soldier(Gradi role, int wage) {
        this.role = role;
        this.wage = wage;
    }

    public Gradi getRole() {
        return role;
    }

    public void setRole(Gradi role) {
        this.role = role;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }
}
