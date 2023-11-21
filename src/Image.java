import java.util.concurrent.TimeUnit;

class Image implements Element{
    String content;

   // public Image(String content) {
       // this.content = content;
   // }
    Image(String name) {
        this.content = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println("Image: " + content);
    }
}

