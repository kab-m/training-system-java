package org.app.commands.concrete;

import org.app.TrainingSystem;
import org.app.commands.Receiver;
import org.app.implementations.Participant;

import java.util.ArrayList;
import java.util.List;

public class TrainingSystemReceiver implements Receiver {
    private final TrainingSystem trainingSystem;

    public TrainingSystemReceiver(TrainingSystem trainingSystem) {
        this.trainingSystem = trainingSystem;
    }

    @Override
    public void performAction() {
        List<Participant> participants = trainingSystem.getParticipants();
        for (Participant p : participants) {
            trainingSystem.trackProgress(p);
        }

    }
}
