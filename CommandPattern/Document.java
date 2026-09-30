package CommandPattern;

public class Document {
    public String content;

    public Document() {
        this.content = "";
    }

    public void save(String content) {
        this.content = content;
        System.out.println("document saved");
        System.out.println();
    }

    public void open() {
        System.out.println("opening document: " + content);
        System.out.println();
    }
}
