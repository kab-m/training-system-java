package org.app.commands.concrete;

import org.app.commands.Command;
import org.app.commands.Invoker;


public class TrainingSystemInvoker implements Invoker {
    private Command command;

    public TrainingSystemInvoker(Command command) {
        this.command = command;
    }

    @Override
    public void setCommand(Command command) {
        this.command = command;
    }

    @Override
    public void executeCommand() {
        command.execute();
    }
}
