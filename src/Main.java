public class Main {
    public static void main(String[] args) {
        Book book = new Book("Your Book Title");

        Section cap1 = new Section("Capitolul 1");
        cap1.add(new Paragraph("This is a paragraph."));
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Paragraph("Another paragraph."));

        Section cap11 = new Section("Subchapter 1.1");
        cap11.add(new Paragraph("Text from subchapter 1.1"));
        cap1.add(cap11);

        book.addContent(cap1);


        TableOfContentUpdate tocUpdate = new TableOfContentUpdate();


        book.accept(tocUpdate);


        TableOfContent toc = tocUpdate.getTableOfContent();
        toc.print();


        toc.print();

        RenderContentVisitor renderVisitor = new RenderContentVisitor();
        book.accept(renderVisitor);

       // System.out.println("Image count: " + renderVisitor.getImageCount());
        //ystem.out.println("Table count: " + renderVisitor.getTableCount());
        ///System.out.println("Paragraph count: " + renderVisitor.getParagraphCount());
    }
}
