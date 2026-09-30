package CommandPattern.Command;

import CommandPattern.Document;

public class SaveCommand {

    Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    public void execute(String content) {
        document.save(content);
    }

}
