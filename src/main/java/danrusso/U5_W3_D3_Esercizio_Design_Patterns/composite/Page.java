package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

public class Page implements Thing {

    public Page() {
    }

    @Override
    public int getPagesNo() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println("Sono una pagina.");
    }
}
