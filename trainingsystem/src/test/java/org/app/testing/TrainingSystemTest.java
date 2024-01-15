package org.app.testing;

import org.app.commands.Command;
import org.app.commands.concrete.TrainingSystemReceiver;
import org.app.commands.concrete.ProgressTracker;
import org.app.implementations.Admin;
import org.app.implementations.Participant;
import org.app.implementations.TrainingModule;
import org.app.TrainingSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TrainingSystemTest {

    @Test
    public void testExecuteCommand() {
        // Create a TrainingSystem instance with some modules and participants
        List<TrainingModule> modules = new ArrayList<>();
        List<Participant> participants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        TrainingSystem trainingSystem = new TrainingSystem(modules, participants, admins);

        // Create a Receiver and a Command
        TrainingSystemReceiver receiver = new TrainingSystemReceiver(trainingSystem);
        Command command = new ProgressTracker(receiver);

        try {
            // Execute the command using the TrainingSystem
            trainingSystem.executeCommand(command);
            System.out.println("Test passed: The ProgressTracker command was executed successfully");
        } catch (Error e) {
            System.out.println("Test failed: " + e.getMessage());
            throw e;
        }
    }
}
