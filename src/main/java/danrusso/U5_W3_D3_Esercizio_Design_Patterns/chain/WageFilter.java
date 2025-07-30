package danrusso.U5_W3_D3_Esercizio_Design_Patterns.chain;

public class WageFilter extends BaseFilter {
    public WageFilter() {
    }

    @Override
    public void atleatThisMuch(Soldier soldier, int number) {
        if (soldier.getWage() >= number) {
            System.out.println("Questo " + soldier.getRole() + " prende almeno " + number + " euro.");
        } else {
            System.out.println("Questo " + soldier.getRole() + " prende meno di " + number + " euro.");
        }
    }

}
