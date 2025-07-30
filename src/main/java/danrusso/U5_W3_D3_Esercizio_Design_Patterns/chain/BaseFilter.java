package danrusso.U5_W3_D3_Esercizio_Design_Patterns.chain;

public abstract class BaseFilter {
    private BaseFilter next;

    public abstract void atleatThisMuch(Soldier soldier, int number);

    public void next(Soldier soldier, int number) {
        if (this.next != null) this.next.atleatThisMuch(soldier, number);
        else System.out.println("Nessun nesso");
    }

    public void setNext(BaseFilter next) {
        this.next = next;
    }
}
