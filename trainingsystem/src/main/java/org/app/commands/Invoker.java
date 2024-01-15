package org.app.commands;

public interface Invoker {
    void setCommand(Command command);

    void executeCommand();
}
