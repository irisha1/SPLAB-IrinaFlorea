class Paragraph implements Element {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    public void print() {
        System.out.println("Paragraph: " + text);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitParagraph(this);
    }
    public void accept(RenderContentVisitor renderVisitor) {
        renderVisitor.visitParagraph(this);
    }
}


