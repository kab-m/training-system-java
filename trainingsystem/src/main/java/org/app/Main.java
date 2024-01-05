package org.app;

import org.app.commands.Invoker;
import org.app.commands.Receiver;
import org.app.commands.concrete.ProgressTracker;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ProgressTracker command = new ProgressTracker(receiver);
        Invoker invoker = new Invoker();

        // 1. Set the command
        invoker.setCommand(command);

        // 2. Execute the command
        invoker.executeCommands();
    }
}



