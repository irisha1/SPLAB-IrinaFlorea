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

        System.out.println("Loading image from URL: " + url);
        return new Image("Image from URL: " + url);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }
}



