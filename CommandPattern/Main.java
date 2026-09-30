package CommandPattern;

import CommandPattern.Command.OpenCommand;
import CommandPattern.Command.SaveCommand;

public class Main {

    public static void main(String[] args) {
        Document document = new Document();

        SaveCommand saveCommand = new SaveCommand(document, "Hello World");
        OpenCommand openCommand = new OpenCommand(document);

        Invoker invoker = new Invoker();

        invoker.setCommand(saveCommand);
        invoker.executeCommand();
        
        invoker.setCommand(openCommand);
        invoker.executeCommand();

        SaveCommand saveCommand2 = new SaveCommand(document, "Hello World modified");
        invoker.setCommand(saveCommand2);
        invoker.executeCommand();

        invoker.setCommand(openCommand);
        invoker.executeCommand();

        /* Even when a new command is implemented, the invoker can execute it without knowing the details */
    }
    
}
