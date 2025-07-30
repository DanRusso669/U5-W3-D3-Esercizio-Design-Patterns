package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Section extends Page {
    private List<Thing> children;

    public Section() {
        this.children = new ArrayList<>();
    }

    @Override
    public int getPagesNo() {
        int sum = 0;
        for (Thing page : children) {
            sum += page.getPagesNo();
        }
        return sum;
    }

    @Override
    public void print() {
        System.out.println("Sono una sezione.");
    }

    public void addAll(Thing... things) {
        this.children.addAll(Arrays.asList(things));
    }


}
