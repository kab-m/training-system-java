package org.app.implementations.testing;

import org.app.implementations.Participant;
import org.app.interfaces.ParticipantInterface;
import org.app.implementations.TrainingModule;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParticipantTest {

    @Test
    public void testAccessTrainingModule() {
        ParticipantInterface participant = new Participant(1, "Username", 100.0, new ArrayList<>());
        TrainingModule module = new TrainingModule("ModuleTitle", "Content", null, null, 0);

        // Test if accessTrainingModule method is called successfully
        try {
            participant.accessTrainingModule(module);
            System.out.println("Assertion passed: Access Training Module successful");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testHasCompletedAllModules() {
        // Create a participant with assigned modules, all marked as completed
        List<TrainingModule> completedModules = new ArrayList<>();
        TrainingModule module1 = new TrainingModule("Module1", "Content", null, null, 0);
        TrainingModule module2 = new TrainingModule("Module2", "Content", null, null, 0);
        module1.setCompleted();
        module2.setCompleted();
        completedModules.add(module1);
        completedModules.add(module2);

        ParticipantInterface participant = new Participant(1, "Username", 100.0, completedModules);

        // Test if hasCompletedAllModules returns true for all completed modules
        try {
            assertTrue(participant.hasCompletedAllModules());
            System.out.println("Assertion passed: Participant has completed all modules");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }

        // Create a participant with assigned modules, all marked as not completed
        List<TrainingModule> incompleteModules = new ArrayList<>();
        incompleteModules.add(new TrainingModule("Module3", "Content", null, null, 0));
        incompleteModules.add(new TrainingModule("Module4", "Content", null, null, 0));

        ParticipantInterface participant2 = new Participant(2, "Username", 100.0, incompleteModules);

        // Test if hasCompletedAllModules returns false for incomplete modules
        try {
            assertFalse(participant2.hasCompletedAllModules());
            System.out.println("Assertion passed: Participant has not completed all modules");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testEquals() {
        Participant participant1 = new Participant(1, "Username", 100.0, new ArrayList<>());
        participant1.setId(1);
        Participant participant2 = new Participant(1, "DifferentUsername", 50.0, new ArrayList<>());
        participant2.setId(1);

        // Test if the equals method correctly identifies them as equal based on id
        try {
            assertTrue(participant1.equals(participant2));
            System.out.println("Assertion passed: The participants are equal based on id");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testHashCode() {
        Participant participant1 = new Participant(1, "Username", 100.0, new ArrayList<>());
        participant1.setId(1);
        Participant participant2 = new Participant(1, "DifferentUsername", 50.0, new ArrayList<>());
        participant2.setId(1);

        // Test if the hashCode method generates the same hash for equal objects
        try {
            assertEquals(participant1.hashCode(), participant2.hashCode());
            System.out.println("Assertion passed: The hash codes are equal for equal participants");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }
}
