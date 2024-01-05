package org.app.implementations;

import org.app.interfaces.ParticipantInterface;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Participant implements ParticipantInterface {
    private int id;
    private String username;
    private Double beenz;
    private List<TrainingModule> assignedModules;

    public Participant(int id, String username, Double beenz, List<TrainingModule> assignedModules) {
        this.id = id;
        this.username = username;
        this.beenz = beenz;
        this.assignedModules = assignedModules;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBeenz(Double beenz) {
        this.beenz = beenz;
    }

    // EmployeeInterface Methods Getters

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public double getBeenz() {
        return this.beenz;
    }

    // ParticipantInterface Methods

    @Override
    public void setAssignedModules(List<TrainingModule> modules) {
        this.assignedModules = modules;
    }

    @Override
    public List<TrainingModule> getAssignedModules() {
        return this.assignedModules;
    }

    @Override
    public void accessTrainingModule(@NotNull TrainingModule module) {
        System.out.println("Accessing Module: "+module.getTitle());
    }

    @Override
    public boolean hasCompletedAllModules() {
        return assignedModules.stream().allMatch(TrainingModule::getCompleted);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Participant user = (Participant) obj;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}