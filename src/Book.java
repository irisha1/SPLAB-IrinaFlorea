import java.util.ArrayList;
import java.util.List;

public class Book implements Element {
    private String title;
    private List<Author> authors = new ArrayList<>();
    private List<Element> contents = new ArrayList<>();
    private TableOfContent tableOfContent;

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        contents.add(element);
    }

    public void addTableOfContent(TableOfContent toc) {
        this.tableOfContent = toc;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public List<Element> getContents() {
        return contents;
    }

    public TableOfContent getTableOfContent() {
        return tableOfContent;
    }

    @Override
    public void accept(Visitor visitor) {
        if (tableOfContent != null) {
            tableOfContent.accept(visitor);
        }

        for (Element content : contents) {
            content.accept(visitor);
        }

        visitor.visitBook(this);
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println("Author: " + author.name);
        }
        for (Element content : contents) {
            content.print();
        }
    }
}
