public class RenderContentVisitor implements Visitor {
    private int imageCount;
    private int tableCount;
    private int paragraphCount;
    private TableOfContent toc = new TableOfContent();

    @Override
    public void visitBook(Book book) {
        toc.addEntry("Book");
    }

    @Override
    public void visitSection(Section section) {
        toc.addEntry("Chapter");
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
        toc.addEntry("Paragraph");
        paragraphCount++;
    }

    @Override
    public void visitImage(Image image) {
        toc.addEntry("Image");
        imageCount++;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        toc.addEntry("Image Proxy");
    }

    @Override
    public void visitTable(Table table) {
        toc.addEntry("Table");
        tableCount++;
    }

    @Override
    public void visitTableOfContent(TableOfContent tableOfContent) {

    }

    public int getImageCount() {
        return imageCount;
    }

    public int getTableCount() {
        return tableCount;
    }

    public int getParagraphCount() {
        return paragraphCount;
    }

    public TableOfContent getTableOfContent() {
        return toc;
    }
}
