class Image implements Element{
    String content;

    public Image(String content) {
        this.content = content;
    }

    public void print() {
        System.out.println("Image: " + content);
    }
}

