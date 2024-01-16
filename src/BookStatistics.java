public class BookStatistics {
    private int imageCount;
    private int tableCount;
    private int paragraphCount;

    public void addImage() {
        imageCount++;
    }

    public void addTable() {
        tableCount++;
    }

    public void addParagraph() {
        paragraphCount++;
    }

    public void printStatistics() {
        System.out.println("Book Statistics:");
        System.out.println("*** Number of images: " + imageCount);
        System.out.println("*** Number of tables: " + tableCount);
        System.out.println("*** Number of paragraphs: " + paragraphCount);
    }
}
