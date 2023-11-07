import java.util.List;
import java.util.ArrayList;

public class SubChapter {
    String title;
    List<Paragraph> paragraphs = new ArrayList<>();
    List<Image> images = new ArrayList<>();
    List<Table> tables = new ArrayList<>();

    public SubChapter(String title) {
        this.title = title;
    }

    public void addParagraph(String content) {
        paragraphs.add(new Paragraph(content));
    }

    public void addImage(String content) {
        images.add(new Image(content));
    }

    public void addTable(String content) {
        tables.add(new Table(content));
    }

    public void print() {
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
        for (Image image : images) {
            image.print();
        }
        for (Table table : tables) {
            table.print();
        }
    }
}



