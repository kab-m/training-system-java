package org.app.commands.concrete;

import org.app.commands.Command;
import org.app.commands.Receiver;

public class ProgressTracker implements Command {
    private final Receiver receiver;

    public ProgressTracker(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.performAction();
    }
}
