package danrusso.U5_W3_D3_Esercizio_Design_Patterns.chain;

public class Soldier {
    private Soldier next;
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

    public Soldier getNext() {
        return next;
    }

    public void setNext(Soldier next) {
        this.next = next;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public void atLeastThisMuch(int number) {
        if (this.getWage() >= number) {
            System.out.println(this.getRole());
        }

        if (next != null) {
            next.atLeastThisMuch(number);
        }

        if (next == null && this.getWage() < number) System.out.println("Nobody is rich.");
    }
}

