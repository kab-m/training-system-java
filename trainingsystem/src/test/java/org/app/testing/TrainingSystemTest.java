package org.app.testing;

import org.app.commands.Command;
import org.app.commands.Invoker;
import org.app.commands.Receiver;
import org.app.commands.concrete.ProgressTracker;
import org.app.implementations.Admin;
import org.app.implementations.Participant;
import org.app.implementations.TrainingModule;
import org.app.TrainingSystem;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingSystemTest {

    @Test
    public void testExecuteCommand() {
        // Create a TrainingSystem instance with some modules and participants
        List<TrainingModule> modules = new ArrayList<>();
        List<Participant> participants = new ArrayList<>();
        List<Admin> admins = new ArrayList<>();
        TrainingSystem trainingSystem = new TrainingSystem(modules, participants, admins);

        // Create a Receiver and a Command
        Receiver receiver = new Receiver();
        Command command = new ProgressTracker(receiver);

        try {
            // Execute the command using the TrainingSystem
            trainingSystem.executeCommand(command);

            // Verify that the command has been executed successfully
            // In this example, we assume that the ProgressTracker command modifies some state in the Receiver
            // You may need to customize this based on the behavior of your commands and receivers
            assertTrue(receiver.isProgressTrackerExecuted());
            System.out.println("Assertion passed: The ProgressTracker command was executed successfully");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            // You can add more logging or handling here if needed
            throw e; // Re-throw the AssertionError to mark the test as failed
        }
    }
}
