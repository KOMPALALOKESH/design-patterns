package CommandPattern.Command;

import CommandPattern.Document;

public class OpenCommand implements ICommand {

    Document document;

    public OpenCommand(Document document) {
        this.document = document;
    }

    public void execute() {
        document.open();
    }

}
