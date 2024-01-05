package org.app.implementations.testing;

import org.app.implementations.Admin;
import org.app.interfaces.AdminInterface;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdminTest {

    @Test
    public void testAccessTrainingSystem() {
        AdminInterface admin = new Admin();
        // Test if accessTrainingSystem method is called successfully
        try {
            admin.accessTrainingSystem();
            System.out.println("Assertion passed: Access Training System successful");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testEquals() {
        Admin admin1 = new Admin();
        admin1.setId(1);
        Admin admin2 = new Admin();
        admin2.setId(1);
        // Test if the equals method correctly identifies them as equal based on id
        try {
            assertTrue(admin1.equals(admin2));
            System.out.println("Assertion passed: The admins are equal based on id");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }

    @Test
    public void testHashCode() {
        Admin admin1 = new Admin();
        admin1.setId(1);
        Admin admin2 = new Admin();
        admin2.setId(1);
        // Test if the hashCode method generates the same hash for equal objects
        try {
            assertEquals(admin1.hashCode(), admin2.hashCode());
            System.out.println("Assertion passed: The hash codes are equal for equal admins");
        } catch (AssertionError e) {
            System.out.println("Assertion failed: " + e.getMessage());
            throw e;
        }
    }
}

