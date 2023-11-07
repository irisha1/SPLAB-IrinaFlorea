public class Main {
    public static void main(String[] args) {
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);

        Chapter chapter1 = discoTitanic.createChapter("Capitolul 1");
        SubChapter subChapter1 = chapter1.createSubChapter("Subcapitolul 1.1");

        subChapter1.addParagraph("Acesta este paragraful 1");
        subChapter1.addParagraph("Acesta este paragraful 2");
        subChapter1.addImage("Imagine 1");
        subChapter1.addTable("Tabel 1");

        // Adăugați un alt subcapitol în capitol1
        SubChapter subChapter2 = chapter1.createSubChapter("Subcapitolul 1.2");
        subChapter2.addParagraph("Acesta este paragraful 1 din Subcapitolul 1.2");
        subChapter2.addImage("Imagine 2 din Subcapitolul 1.2");
        subChapter2.addTable("Tabel 2 din Subcapitolul 1.2");

        discoTitanic.print();
    }
}


