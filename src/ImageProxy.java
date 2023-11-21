class ImageProxy implements Element {
    private String url;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public void print() {
        if (realImage == null) {
            realImage = loadImage();
        }
        realImage.print();
    }

    private Image loadImage() {
        // Simulate loading the image with URL
        System.out.println("Loading image from URL: " + url);
        // Într-o implementare reală, aici ai putea crea un obiect Image cu URL-ul
        return new Image("Image from URL: " + url);
    }
}



