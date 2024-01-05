package org.app.commands.concrete;

import org.app.commands.Command;
import org.app.commands.Invoker;
import org.app.commands.Receiver;

public class ProgressTracker implements Command {
    private Receiver receiver;

    public ProgressTracker(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
