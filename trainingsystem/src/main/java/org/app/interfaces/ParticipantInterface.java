package org.app.interfaces;

import org.app.implementations.TrainingModule;

import java.util.List;

public interface ParticipantInterface extends EmployeeInterface {

    void setAssignedModules(List<TrainingModule> modules);
    List<TrainingModule> getAssignedModules();
    void accessTrainingModule(TrainingModule module);
    boolean hasCompletedAllModules();

}