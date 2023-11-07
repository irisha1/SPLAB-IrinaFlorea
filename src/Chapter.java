import java.util.List;
import java.util.ArrayList;

public class Chapter {
    String title;
    List<SubChapter> subChapters = new ArrayList<>();

    public Chapter(String title) {
        this.title = title;
    }

    public SubChapter createSubChapter(String subChapterTitle) {
        SubChapter subChapter = new SubChapter(subChapterTitle);
        subChapters.add(subChapter);
        return subChapter;
    }

    public void print() {
        for (SubChapter subChapter : subChapters) {
            System.out.println("SubChapter: " + subChapter.title);
            subChapter.print();
        }
    }
}



