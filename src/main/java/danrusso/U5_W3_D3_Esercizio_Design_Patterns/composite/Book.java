package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

import java.util.List;

public class Book {
    private List<Author> authors;
    private double price;
    private List<Section> children;

    public Book(List<Author> authors, double price, List<Section> children) {
        this.authors = authors;
        this.price = price;
        this.children = children;
    }

    public int getNumberPages() {
        int sum = 0;
        for (Section chapter : children) {
            sum += chapter.getNumberPages();
        }
        return sum;
    }

    public void print() {
        for (Section chapter : children) {
            chapter.print();
        }
    }
}
