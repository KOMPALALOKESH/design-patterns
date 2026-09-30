package CommandPattern;

import CommandPattern.Command.OpenCommand;
import CommandPattern.Command.SaveCommand;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();
        SaveCommand saveCommand = new SaveCommand(document);
        OpenCommand openCommand = new OpenCommand(document);

        saveCommand.execute("Hello World");
        openCommand.execute();

        saveCommand.execute("Hello World modified");
        openCommand.execute();
    }
    
}
