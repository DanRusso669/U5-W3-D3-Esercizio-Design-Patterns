package danrusso.U5_W3_D3_Esercizio_Design_Patterns.composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Page page1 = new Page("Lorem ipsum 1");
        Page page2 = new Page("Lorem ipsum 2");
        Page page3 = new Page("Lorem ipsum 3");
        Page page4 = new Page("Lorem ipsum 4");
        Page page5 = new Page("Lorem ipsum 5");
        Page page6 = new Page("Lorem ipsum 6");
        Page page7 = new Page("Lorem ipsum 7");
        Section chapter1 = new Section();
        Section chapter2 = new Section();
        Section chapter2_1 = new Section();
        chapter1.addAll(page1, page2, page3);
        chapter2_1.addAll(page4);
        chapter2.addAll(chapter2_1, page5, page6, page7);
        Author author = new Author("Mario", "Rossi");
        Book book = new Book(List.of(author), 20.99, List.of(chapter1, chapter2));

        System.out.println("***********************");
        System.out.println(book.getNumberPages());
        book.print();
        System.out.println("***********************");
    }
}
