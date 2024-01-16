import java.util.ArrayList;
import java.util.List;

public class TableOfContentUpdate implements Visitor {
    int pageCounter = 0;
    TableOfContent tableOfContents = new TableOfContent();

    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        tableOfContents.addEntry(section.getTitle() + "................" + pageCounter);
    }

    //@Override
    public void visitTableOfContents(TableOfContent tableOfContents) {

    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        pageCounter++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageproxy) {

    }

    @Override
    public void visitImage(Image image) {
        pageCounter++;
    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {

    }

    @Override
    public void visitTable(Table table) {
        pageCounter++;
    }

    public TableOfContent getTableOfContent() {
        return tableOfContents;
    }
}