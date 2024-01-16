public interface Visitor {
    void visitBook(Book book);
    void visitSection(Section section );
    void visitTable (Table table);
    void  visitParagraph (Paragraph paragraph);

    void visitImageProxy (ImageProxy imageproxy);
    void visitImage( Image image);

    void visitTableOfContent(TableOfContent tableOfContent);
}
