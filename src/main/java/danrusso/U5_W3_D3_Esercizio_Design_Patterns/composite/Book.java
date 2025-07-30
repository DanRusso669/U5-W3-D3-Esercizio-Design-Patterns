package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

import java.util.List;

public class Book implements Thing {
    private List<Author> authors;
    private double price;
    private List<Thing> pages;

    public Book(List<Author> authors, double price, List<Thing> pages) {
        this.authors = authors;
        this.price = price;
        this.pages = pages;
    }

    @Override
    public int getPagesNo() {
        int sum = 0;
        for (Thing page : pages) {
            sum += page.getPagesNo();
        }
        return sum;
    }

    @Override
    public void print() {
        System.out.println("Questo è un libro.");
        for (Thing page : pages) {
            page.print();
        }
    }
}
