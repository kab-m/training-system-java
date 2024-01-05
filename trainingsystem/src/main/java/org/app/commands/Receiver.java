package org.app.commands;

public class Receiver {
    Boolean test = false;
    public void action() {
        // Implement the action to track progress
        System.out.println("Tracking progress...");
        test = true;
        // Add your logic here
    }


    public boolean isProgressTrackerExecuted() {
        return this.test;
    }

}
