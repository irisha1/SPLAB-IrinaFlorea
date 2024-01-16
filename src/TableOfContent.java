import java.util.ArrayList;
import java.util.List;

public class TableOfContent implements Element {
    private List<String> entries = new ArrayList<>();

    public void addEntry(String entry) {
        entries.add(entry);
    }

    public List<String> getEntries() {
        return entries;
    }

    // @Override
    public void print() {
        System.out.println("Table of Contents:");
        int pageNumber = 1;

        for (String entry : entries) {
            if (entry.startsWith("Chapter") || entry.startsWith("Subchapter")) {
                System.out.println(entry + " " + pageNumber);
            } else if (entry.startsWith("Paragraph")) {
                System.out.println("\t" + entry + " " + pageNumber);
            } else {
                System.out.println(entry + " " + pageNumber);
            }
            pageNumber += 3; // Ajustează logică pentru numărul de pagini asociate fiecărei intrări
        }
    }

    @Override
    public void accept(Visitor visitor) {
        // Adăugați logica pentru vizitarea tabelelor de conținut (dacă este necesar)
        visitor.visitTableOfContent(this);
    }
}


