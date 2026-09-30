package CommandPattern.Command;

import CommandPattern.Document;

public class OpenCommand {

    Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.open();
    }

}
