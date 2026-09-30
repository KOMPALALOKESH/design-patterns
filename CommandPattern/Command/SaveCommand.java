package CommandPattern.Command;

import CommandPattern.Document;

public class SaveCommand implements ICommand {

    Document document;
    String content;

    public SaveCommand(Document document, String content) {
        this.document = document;
        this.content = content;
    }

    public void execute() {
        document.save(content);
    }

}
