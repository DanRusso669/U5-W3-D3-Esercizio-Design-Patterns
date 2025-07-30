package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

public class Page implements Thing {
    private String content;

    public Page(String content) {
        this.content = content;
    }

    @Override
    public int getNumberPages() {
        return 1;
    }

    @Override
    public void print() {
        System.out.println(this.content);
    }
}
