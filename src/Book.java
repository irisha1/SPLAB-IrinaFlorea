import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Book {
    String title;
    List<Author> authors = new ArrayList<>();
    List<Element> contents = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addContent(Element element) {
        contents.add(element);
    }

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
