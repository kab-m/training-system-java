package org.app;

import org.app.commands.Command;
import org.app.commands.Invoker;
import org.app.commands.Receiver;
import org.app.commands.concrete.ProgressTracker;
import org.app.implementations.Admin;
import org.app.implementations.Participant;
import org.app.implementations.TrainingModule;
import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainingSystem {
    private List<TrainingModule> modules;
    private List<Participant> participants;
    private List<Admin> admins;


    // Constructor
    public TrainingSystem(List<TrainingModule> modules, List<Participant> participants, List<Admin> admins) {
        if (modules.isEmpty()){
            System.out.println("No Modules Error");
        }
        this.modules = modules;
        this.participants = participants;
        this.admins = admins;
    }

    // Setters

    public void setModules(List<TrainingModule> modules) {
        this.modules = modules;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }

    // Getters

    public List<TrainingModule> getModules() {
        return modules;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    // Methods

    public void assignModule(TrainingModule module, @NotNull List<Participant> participants) {
        for (Participant participant : participants) {
            List<TrainingModule> modules = participant.getAssignedModules();
            modules.add(module);
            participant.setAssignedModules(modules);
        }
    }

    public List<List<TrainingModule>> trackProgress(@NotNull Participant participant) {
        List<TrainingModule> totalModules = participant.getAssignedModules();
        List<TrainingModule> missingModules = new ArrayList<>();
        List<TrainingModule> completedModules = new ArrayList<>();
        List<List<TrainingModule>> results = new ArrayList<>();
        for (TrainingModule module : totalModules) {
            if (module.getCompleted()) {
                completedModules.add(module);
            } else {
                missingModules.add(module);
            }
        }
        results.add(completedModules);
        results.add(missingModules);
        return results;
    }

    public void removeParticipants(List<Participant> participants) {
        this.participants.removeAll(participants);
    }

    public void executeCommand(Command command) {
        command.execute();
    }

//    public static void main(String[] args) {
//        Receiver receiver = new Receiver();
//        ProgressTracker command = new ProgressTracker(receiver);
//        Invoker invoker = new Invoker();
//
//        // 1. Set the command
//        invoker.setCommand(command);
//
//        // 2. Execute the command
//        invoker.executeCommands();
//    }
}