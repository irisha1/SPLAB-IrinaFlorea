import java.util.ArrayList;
import java.util.List;

class Section implements Element {
    private String title;
    private List<Element> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void add(Element element) {
        elements.add(element);
    }

    public void print() {
        System.out.println(title);
        for (Element element : elements) {
            element.print();
        }
    }
    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSection(this);
    }

    public String getTitle() {
        return this.title;
    }
}