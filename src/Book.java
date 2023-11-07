import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class Book {
    String title;
    List<Author> authors = new ArrayList<>();
    List<Chapter> chapters = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Chapter createChapter(String chapterTitle) {
        Chapter chapter = new Chapter(chapterTitle);
        chapters.add(chapter);
        return chapter;
    }

    public void print() {
        System.out.println("Book Title: " + title);
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println(author.name);
        }
        System.out.println("Table of Contents:");
        for (Chapter chapter : chapters) {
            System.out.println("Chapter: " + chapter.title);
            chapter.print();
        }
    }
}
