package org.app.implementations.testing;

import org.app.implementations.TrainingModule;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrainingModuleTest {

    @Test
    public void testEquals() {
        // Create two TrainingModule instances with the same title
        TrainingModule module1 = new TrainingModule("ModuleTitle", "Content", null, null, 0);
        TrainingModule module2 = new TrainingModule("ModuleTitle", "DifferentContent", null, null, 0);

        try {
            // Test if the equals method correctly identifies them as equal based on title
            assert module1.equals(module2);
            System.out.println("Assertion passed: The modules are equal based on title");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            // You can add more logging or handling here if needed
            throw e; // Re-throw the AssertionError to mark the test as failed
        }

    }

    @Test
    public void testHashCode() {
        // Create two TrainingModule instances with the same title
        TrainingModule module1 = new TrainingModule("ModuleTitle", "Content", null, null, 0);
        TrainingModule module2 = new TrainingModule("ModuleTitle", "DifferentContent", null, null, 0);

        try {
            // Test if the hashCode method generates the same hash for equal objects
            assert module1.hashCode() == module2.hashCode();
            System.out.println("Assertion passed: The hash codes are the same for equal objects");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            // You can add more logging or handling here if needed
            throw e; // Re-throw the AssertionError to mark the test as failed
        }
    }

    @Test
    public void testSetRewardPercentage() {
        // Create a TrainingModule instance
        TrainingModule module = new TrainingModule("ModuleTitle", "Content", null, null, 0);

        try {
            // Test setting a valid reward percentage
            module.setRewardPercentage(50);
            assert module.getRewardPercentage() == 50;
            System.out.println("Assertion passed: Valid reward percentage set successfully");

            // Test setting an invalid reward percentage
            System.out.println("setting reward to 150, FAil Expected");
            module.setRewardPercentage(150);
            assert module.getRewardPercentage() == 50; // Assuming you want to assert the value after an invalid set
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            // You can add more logging or handling here if needed
            throw e; // Re-throw the AssertionError to mark the test as failed
        }
    }

    @Test
    public void testUpdateModule() {
        // Create a TrainingModule instance
        TrainingModule module = new TrainingModule("ModuleTitle", "Content", null, null, 0);

        // Test updating the module
        try {
            // Test updating the module
            module.updateModule("NewTitle", "NewContent", null);
            assert "NewTitle".equals(module.getTitle());
            assert "NewContent".equals(module.getContent());
            System.out.println("Assertion passed: Module updated successfully");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            // You can add more logging or handling here if needed
            throw e; // Re-throw the AssertionError to mark the test as failed
        }
    }


}

