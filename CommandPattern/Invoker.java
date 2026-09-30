package CommandPattern;

import CommandPattern.Command.ICommand;

public class Invoker {

    private ICommand command;

    public Invoker() {
    }

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
