class Table implements Element {
    String content;

    public Table(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Table: " + content);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTable(this);
    }
}

